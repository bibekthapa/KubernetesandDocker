#Steps
#First get the image
#Set the working directory
#Copy the jar file from local to working directory
#RUN IT 

FROM openjdk:17 
WORKDIR /app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} deloy.jar
ENTRYPOINT [ "java", "-jar" , "deloy.jar" ]

