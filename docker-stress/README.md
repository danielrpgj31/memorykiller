# dockerfile-stress

#### Usage

### Build
```
docker build -t pkar/dockerstress
```
### Run inside the container
### You can change value of memory and timeout
```
sh stress --cpu 2 --vm 1 --vm-bytes 256M --timeout 300s
```
