# AWS SNS Message Publisher

## Overview
This project is a Spring Boot application for publishing messages to an AWS SNS Topic. It provides a REST endpoint for sending messages to a specified SNS Topic.

## Features
- Publish messages to AWS SNS Topics.
- Easy-to-configure AWS credentials and region.
- Simple REST API integration.

## Requirements
- Java 8 or higher.
- AWS credentials with SNS permissions.
- Spring Boot 2.5+.
- Maven.

## Configuration
Update the following properties in the `application.properties` or `application.yml` file:
```properties
aws.access.key=YOUR_AWS_ACCESS_KEY
aws.secret.key=YOUR_AWS_SECRET_KEY
aws.sns.topic.arn=YOUR_SNS_TOPIC_ARN
aws.region=YOUR_AWS_REGION
