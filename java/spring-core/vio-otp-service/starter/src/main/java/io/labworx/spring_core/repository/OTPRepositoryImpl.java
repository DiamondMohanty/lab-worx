package io.labworx.spring_core.repository;

import java.util.Random;

public class OTPRepositoryImpl implements OTPRespository {

    @Override
    public int getOTP(int seed) {
        return new Random(seed).nextInt(1000, 9999);
    }

}
