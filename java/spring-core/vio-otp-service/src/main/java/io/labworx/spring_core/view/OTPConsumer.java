package io.labworx.spring_core.view;

import org.springframework.beans.factory.annotation.Autowired;

import io.labworx.spring_core.service.VioOTPService;

public class OTPConsumer {

    private VioOTPService vioOTPService;

    public OTPConsumer() {

    }

    @Autowired
    public OTPConsumer(VioOTPService vioOTPService) {
        this.vioOTPService = vioOTPService;
    }

    public int getOTP(int seed) {
        return vioOTPService.getOTP(seed);
    }

}
