package io.labworx.spring_core.view;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.labworx.spring_core.AppConfig;

@SpringBootTest
public class OTPConsumerTests {

    @Test
    public void testPrintScores() {
        var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		var consumer = applicationContext.getBean(OTPConsumer.class);
        int seedForOTP = 2;
        int expectedOTP = new Random(seedForOTP).nextInt(0, 1000);
        int actualOTP = consumer.getOTP(seedForOTP);
        assertTrue(expectedOTP == actualOTP);
		applicationContext.close();
    }

}
