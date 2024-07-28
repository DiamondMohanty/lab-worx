package io.labworx.spring_core.service;

import org.springframework.beans.factory.annotation.Autowired;

import io.labworx.spring_core.repository.OTPRespository;

public class VioOTPServiceImpl implements VioOTPService {

    private OTPRespository otpRespository;

    public VioOTPServiceImpl() { }

    @Autowired
    public VioOTPServiceImpl(OTPRespository otpRespository) {
        this.otpRespository = otpRespository;
    }

    @Override
    public int getOTP(int seed) {
        return this.otpRespository.getOTP(seed);
    }

}
