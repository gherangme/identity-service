# Identity service
This microservice is responsible for:
* Onboarding users
* Roles and permissions
* Authentication

## Tech stack
* Build tool: maven >= 3.9.5
* Java: 21
* Framework: Spring boot 3.2.x
* DBMS: MySQL

## Prerequisites
* Java SDK 21
* A MySQL server

## Start application
`mvn spring-boot:run`

## Build application
`mvn clean package`

## Docker guideline
### Build docker image
`docker build -t <account>/identity-service:0.9.0 .`
### Push docker image to Docker Hub
`docker image push <account>/identity-service:0.9.0`
### Create network:
`docker network create hungpham-network`
### Start MySQL in hungpham-network
`docker run --network hungpham-network --name mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=1234 -d mysql:8.0.36-debian`
### Run your application in hungpham-network
`docker run --name identity-service --network hungpham-network -p 8080:8080 -e DBMS_CONNECTION=jdbc:mysql://mysql:3306/identity_service identity-service:0.9.0`
