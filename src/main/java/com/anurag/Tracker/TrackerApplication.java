package com.anurag.Tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class TrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrackerApplication.class, args);
	}

}
