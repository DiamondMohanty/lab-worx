package io.labworx.spring_core.api;

import io.labworx.spring_core.service.VioOTPService;
import io.labworx.spring_core.service.VioOTPServiceImpl;

public class OTPApi {

    private VioOTPService vioOTPService;

    public OTPApi() {
        this.vioOTPService = new VioOTPServiceImpl();
    }

    public int getOTP(int seed) {
        return vioOTPService.getOTP(seed);
    }

}
