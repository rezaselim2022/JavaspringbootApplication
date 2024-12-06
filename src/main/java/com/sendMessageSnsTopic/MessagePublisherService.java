package com.sendMessageSnsTopic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.sns.SnsClient;
import software.amazon.awssdk.services.sns.model.PublishRequest;
import software.amazon.awssdk.services.sns.model.PublishResponse;

@Service

public class MessagePublisherService {
    private final SnsClient snsClient;
    @Value("${aws.sns.topic.arn}")
    private String snsTopicArn;

    public MessagePublisherService(SnsClient snsClient) {
        this.snsClient = snsClient;
    }

    public String publishMessage(String message){
        PublishRequest publishRequest = PublishRequest.builder()
                .message(message)
                .topicArn(snsTopicArn)
                .build();
        PublishResponse result = snsClient.publish(publishRequest);
        return result.messageId();
    }

}
