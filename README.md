# Project: Validating Form Input using Spring

This project is for educational purposes only. This guide is based on [Spring Guide for Validating Form Input](https://spring.io/guides/gs/validating-form-input/).

# About

It is a simple form component that validates a certain form field. In this example, we will validate a "Name" and "Age" field.

# Run Locally

Clone the project

```bash
  git clone https://github.com/donchriscorleone/spring-validating-form-input.git
```

Go to the project directory

```bash
  cd validating-form-input
```

Build the project

```bash
  ./mvnw clean package
```

Start the project
```bash
  java -jar target/*.jar
```

1. Open a browser then go to localhost:8080
2. The "Name" field has a minimum of 2 characters and maximum of 30 characters. The "Age" field has a minimum value of 18.
3. To propagate the errors, set the "Name" field into a single character and "Age" field by 15 then click Submit.
