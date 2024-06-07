package example;

import config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import java.lang.classfile.Annotation;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");
//        System.out.println("in main method");
        PaymentImplementClass beanpayImp =(PaymentImplementClass) context.getBean("paymentImpl");
//        System.out.println("after taking context in main");
        beanpayImp.makePayment(1000);

    }
}
