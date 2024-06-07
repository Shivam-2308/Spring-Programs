package config;

import aop.AspectAop;
import example.PaymentImplementClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@ComponentScan(basePackages = "example,aop")
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {
    @Bean
    public AspectAop createAop(){
        return new AspectAop();
    }
    @Bean
    public PaymentImplementClass createPayment(){
        return new PaymentImplementClass();
    }

}
