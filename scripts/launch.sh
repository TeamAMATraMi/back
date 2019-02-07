#!/bin/sh
cd /deploy/applitrami-back/
docker-compose up -d
kill $(jps -v | grep AppliTrami-0.1.0.jar | grep -o '^[0-9]*')
java -jar target/AppliTrami-0.1.0.jar
