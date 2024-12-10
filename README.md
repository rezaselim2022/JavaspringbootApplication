# AWS SNS Message Publisher
# AWS SNS Integration with SQS, Email, and Lambda

## Overview
This project is a Spring Boot application for publishing messages to an AWS SNS Topic. It provides a REST endpoint for sending messages to a specified SNS Topic.
It integrates with AWS services such as:
- **AWS SQS** for message queuing.
- **Email** for notifications.
- **AWS Lambda** to process messages and save them into **AWS DynamoDB**.

## Features
- Publish messages to an SNS Topic using a REST API.
- Integrates with subscribers like SQS, Email, and Lambda.
- Supports AWS CloudFormation for infrastructure provisioning.

## Architecture
1. A message is sent to the **SNS Topic**.
2. **SNS Subscribers**:
   - **AWS SQS**: Receives messages for further processing.
   - **Email Endpoint**: Notifies users.
   - **AWS Lambda**: Processes messages and stores them in **DynamoDB**.

## Prerequisites
- **Java 8+**
- **Maven**
- **AWS CLI** with credentials configured.
- AWS resources created via the **CloudFormation Stack**:
  - SNS Topic with SQS, Email, and Lambda subscribers.
  - DynamoDB table for storing data.

