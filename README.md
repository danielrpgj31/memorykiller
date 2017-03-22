# memorykiller
Memory eating java code with docker

## this is to create and run a docker container to run a program which will keep consuming memory till it crashes.

## unzip the files in a folder
#then Run install.sh

#IF you do HTTP to port 89 you will get the free memory. Refresh the screen to get the lates free memory
docker build -t test/memoryeater .
docker run -d --name memorytest -p 89:80 test/memoryeater



# if you do "docker logs memorytest " you will see the memory utilization every 2 seconds
# if you want different rates please feel free to edit MemoryEater.java
