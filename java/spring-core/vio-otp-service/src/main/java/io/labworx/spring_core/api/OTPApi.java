package io.labworx.spring_core.api;

import org.springframework.beans.factory.annotation.Autowired;

import io.labworx.spring_core.service.VioOTPService;

public class OTPApi {

    @Autowired
    private VioOTPService vioOTPService;

    String clientVendor;

    public String getOTP(int seed) {
        return "OTP: " + vioOTPService.getOTP(seed) + " expires in " + vioOTPService.getExpiry() + " for client: " + this.clientVendor;
    }

    public void setExpiry(int timeInSeconds) {
        vioOTPService.setExpiry(timeInSeconds);
    }

    @Autowired
    private void setClientVendor(String clientVendor) {
        this.clientVendor = clientVendor;
    }

}
