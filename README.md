# spring-aws-sqs
Testing ways of better containerization of spring apps

1) Turn on the Docker Engine.

2) To run the application simply do (without docker container):

```bash
./gradlew bootRun
```

to quick test the application 

```
http://localhost:8080/time
```
###To Run the application in a container

1) Compile the application

```bash
./gradlew clean build -x test unzip
```

2) Create the container:
docker build -t gomezrondon/spring-container .

3)  To run the container run:

```
docker run -p 8080:8080 gomezrondon/spring-container -d
```

To test the container:
```
http://192.168.99.100:8080/time
```

4) to stop the running container
```
docker stop <CONTAINER ID>
```


###To Run the container with a docker-compose file

After step 1, execute
```
docker-compose up -d
```

to stop the running container
```
docker-compose down
```