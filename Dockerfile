FROM openjdk
MAINTAINER Venkat <pv.v@tcs.com> 
# this is to create a java program which will consume memory and die after a while
COPY MemoryEater.class  /
WORKDIR /
RUN apt-get update && apt-get install -y  nginx
COPY default /etc/nginx/sites_enabled/



CMD /usr/sbin/nginx -c /etc/nginx/nginx.conf; /usr/bin/java -Xmx512M MemoryEater
#CMD [ /bin/bash ]
