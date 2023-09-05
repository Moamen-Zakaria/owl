package com.knet.owl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class OwlApplication {

	public static void main(String[] args) {
		SpringApplication.run(OwlApplication.class, args);
	}

}
