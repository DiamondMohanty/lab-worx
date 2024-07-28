package io.labworx.spring_core.service;


import io.labworx.spring_core.repository.OTPRepositoryImpl;
import io.labworx.spring_core.repository.OTPRespository;

public class VioOTPServiceImpl implements VioOTPService {

    private OTPRespository otpRespository;

    public VioOTPServiceImpl() { 
        this.otpRespository = new OTPRepositoryImpl();
    }

    @Override
    public int getOTP(int seed) {
        return this.otpRespository.getOTP(seed);
    }

}
