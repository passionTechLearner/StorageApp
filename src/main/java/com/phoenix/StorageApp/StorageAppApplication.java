package com.phoenix.StorageApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class StorageAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StorageAppApplication.class, args);
	}

}
