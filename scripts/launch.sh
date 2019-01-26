#!/bin/sh
cd ../
docker-compose up -d
java -jar target/gs-spring-boot-0.1.0.jar
