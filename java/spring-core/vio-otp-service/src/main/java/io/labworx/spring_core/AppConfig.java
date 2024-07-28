package io.labworx.spring_core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.labworx.spring_core.repository.OTPRespository;
import io.labworx.spring_core.repository.OTPRepositoryImpl;
import io.labworx.spring_core.service.VioOTPService;
import io.labworx.spring_core.service.VioOTPServiceImpl;
import io.labworx.spring_core.view.OTPConsumer;

@Configuration
public class AppConfig {

    @Bean
	public VioOTPService instantiateOTPService() {
		return new VioOTPServiceImpl(instantiateOTPRepository());
	}

	public OTPRespository instantiateOTPRepository() {
		return new OTPRepositoryImpl();
	}

    @Bean
    public OTPConsumer instantiateOTPConsumer() {
        return new OTPConsumer(instantiateOTPService());
    }

}
