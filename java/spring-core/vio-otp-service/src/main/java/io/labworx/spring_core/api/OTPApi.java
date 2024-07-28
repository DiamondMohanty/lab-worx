package io.labworx.spring_core.api;

import org.springframework.beans.factory.annotation.Autowired;

import io.labworx.spring_core.service.VioOTPService;

public class OTPApi {

    @Autowired
    private VioOTPService vioOTPService;

    public String getOTP(int seed) {
        return "OTP: " + vioOTPService.getOTP(seed) + " expires in " + vioOTPService.getExpiry();
    }

    public void setExpiry(int timeInSeconds) {
        vioOTPService.setExpiry(timeInSeconds);
    }

}
