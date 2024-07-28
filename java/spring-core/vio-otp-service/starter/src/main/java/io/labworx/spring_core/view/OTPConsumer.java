package io.labworx.spring_core.view;

import io.labworx.spring_core.service.VioOTPService;
import io.labworx.spring_core.service.VioOTPServiceImpl;

public class OTPConsumer {

    private VioOTPService vioOTPService;

    public OTPConsumer() {
        this.vioOTPService = new VioOTPServiceImpl();
    }

    public OTPConsumer(VioOTPService vioOTPService) {
        this.vioOTPService = vioOTPService;
    }

    public int getOTP(int seed) {
        return vioOTPService.getOTP(seed);
    }

}
