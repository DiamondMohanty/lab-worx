package io.labworx.spring_core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.labworx.spring_core.api.OTPApi;
import io.labworx.spring_core.repository.OTPRepositoryImpl;
import io.labworx.spring_core.repository.OTPRespository;
import io.labworx.spring_core.service.VioOTPService;
import io.labworx.spring_core.service.VioOTPServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    OTPRespository getOTPRespository() {
        return new OTPRepositoryImpl();
    }

    @Bean
    VioOTPService getVioOTPService() {
        return new VioOTPServiceImpl();
    }

    @Bean
    OTPApi getOTPApi() {
        return new OTPApi();
    }
}
