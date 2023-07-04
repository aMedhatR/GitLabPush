package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableFeignClients

public class GitlabPushApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(GitlabPushApplication.class);
		GitLabControlleer gitLabControlleer  = applicationContext.getBean(GitLabControlleer.class);
		gitLabControlleer.createFile("application3.json", "main", "initzl");
	}

}
