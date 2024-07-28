package io.labworx.spring_core.service;

import org.springframework.beans.factory.annotation.Autowired;

import io.labworx.spring_core.repository.OTPRespository;

public class VioOTPServiceImpl implements VioOTPService {

    @Autowired
    private OTPRespository otpRespository;
    
    int expiry;

    @Override
    public int getOTP(int seed) {
        return this.otpRespository.getOTP(seed);
    }

    public void setExpiry(int timeInSeconds) {
        this.expiry = timeInSeconds;
    }

    public int getExpiry() {
        return this.expiry;
    }
}
