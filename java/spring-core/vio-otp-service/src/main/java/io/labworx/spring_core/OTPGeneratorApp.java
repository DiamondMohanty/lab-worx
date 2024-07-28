package io.labworx.spring_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.labworx.spring_core.api.OTPApi;

@SpringBootApplication
public class OTPGeneratorApp {

	public static void main(String[] args) {
		SpringApplication.run(OTPGeneratorApp.class, args);
		runner();
	}

	public static void runner() {
		var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		var apiClient1 = applicationContext.getBean(OTPApi.class);
		var apiClient2 = applicationContext.getBean(OTPApi.class);
		int seedForOtp = 2;
		int expiryTime1 = 10;
		int expiryTime2 = 20;
		apiClient1.setExpiry(expiryTime1);
		apiClient2.setExpiry(expiryTime2);
		System.out.println(apiClient1.getOTP(seedForOtp));
		System.out.println(apiClient2.getOTP(seedForOtp));
		applicationContext.close();
	}

}
