package com.example.shop.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

@Configuration
public class DynamoDBConfig {
	
	@Value("${amazon.aws.accesskey}")
	private String awsAccessKey;
	
	@Value("${amazon.aws.secretkey}")
	private String awsSecretKey;
	
	@Value("${amazon.aws.region}")
	private String awsRegion;
	
	@Value("${amazon.dynamodb.endpoint}")
	private String awsDyanamoDBEndPoint;
	
	@Bean
	public DynamoDBMapper mapper()
	{
		return new DynamoDBMapper(amazoDynamoDBCongif());
	}

	private AmazonDynamoDB amazoDynamoDBCongif() {
		return AmazonDynamoDBClientBuilder.standard()
				.withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(awsDyanamoDBEndPoint, awsRegion))
				.withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(awsAccessKey,awsSecretKey)))
				.build();
	}
	
	
	
	
	

}
