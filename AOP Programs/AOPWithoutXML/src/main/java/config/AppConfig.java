package config;

import aop.AspectAop;
import example.PaymentImplementClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.Base64;
//@ComponentScan(basePackages = "example,aop")
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
    @Bean
    public AspectAop createAop(){
        return new AspectAop();
    }
    @Bean("paymentBean")
    public PaymentImplementClass createPayment(){
        return new PaymentImplementClass();
    }
}
