FROM maven:3.5-jdk-8-alpine

#coping src of your framework

COPY src /Users/k-bhatt/eclipse-workspace1/APIFramework/src

#coping pom file of your framework

COPY pom.xml /Users/k-bhatt/eclipse-workspace1/APIFramework

#running actual command

RUN mvn -f /Users/k-bhatt/eclipse-workspace1/APIFramework/pom.xml clean test verify