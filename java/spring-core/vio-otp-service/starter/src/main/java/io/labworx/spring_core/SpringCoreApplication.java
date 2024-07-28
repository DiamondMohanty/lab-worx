package io.labworx.spring_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.labworx.spring_core.view.OTPConsumer;


@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreApplication.class, args);
		printSampleOTP();
	}

	public static void printSampleOTP() {
		var consumer = new OTPConsumer();
		int seedForOTP = 2;
		System.out.println(consumer.getOTP(seedForOTP));
	}
}
