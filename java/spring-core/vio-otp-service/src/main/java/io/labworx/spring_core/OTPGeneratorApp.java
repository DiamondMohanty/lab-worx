package io.labworx.spring_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.labworx.spring_core.api.OTPApi;

@SpringBootApplication
public class OTPGeneratorApp {

	public static void main(String[] args) {
		SpringApplication.run(OTPGeneratorApp.class, args);
		runner();
	}

	public static void runner() {
		var apiClient = new OTPApi();
		int seedForOtp = 2;
		System.out.println("OTP: " + apiClient.getOTP(seedForOtp));
	}

}
