package example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("autoConfig.xml");
        Student student =context.getBean("student", Student.class);
        System.out.println(student.getName());
        System.out.println(student.getAddress());
        System.out.println(student.getAddress2());

    }
}
