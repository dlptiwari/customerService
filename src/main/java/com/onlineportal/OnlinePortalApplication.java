package com.onlineportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan({"com.onlineportal.*"})
public class OnlinePortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlinePortalApplication.class, args);
	}
}
