# daybook
My personal Java Playground project.

## Setup
Create from the `.dist` templates configuration files:
* `./docker-compose.yml`
* `./src/main/resources/application.properties`

Then provide your database credentials. It should match in both files.

## Build
Just execute `./gradlew build`

Check if the app works in JVM:
```bash
$ java -jar build/libs/daybook-0.1.1.jar
```
_Note: Pay attention to specify the current version of the app in the jar filename_

## Development Deploy
It uses the **docker-compose** for building images and runnning containers.
```bash
$ docker-compose up --build
```
Like so you will see the logs from all the containers in the follow mode.
To keep the project running stop it:
```bash
$ docker-compose down
``` 
and start docker-compose services separately:
```bash
$ docker-compose start db
Starting db ... done

$ docker-compose start app
Starting app ... done
```
I start **db** first becasue the **app** is linked to it and requires it to be running.
