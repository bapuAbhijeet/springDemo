FROM openjdk:8 
ADD target/user-mysql.jar user-mysql.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","user-mysql.jar"]
