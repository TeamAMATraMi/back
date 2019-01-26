#!/bin/sh
cd /deploy/applitrami-back/
docker-compose up -d
java -jar target/gs-spring-boot-0.1.0.jar
