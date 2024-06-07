package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student student =context.getBean("student",Student.class);
        System.out.println(student.getAddress());
        System.out.println(student.getName());
    }
}
