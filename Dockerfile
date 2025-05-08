FROM openjdk:21-jdk

WORKDIR /app

# Copy your project files
COPY . .

# Build your project
RUN mvn clean install

# Specify the command to run your application
CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]