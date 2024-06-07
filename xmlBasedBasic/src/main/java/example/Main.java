package example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        //Using xml
        Resource resource=new ClassPathResource("bean.xml");
        BeanFactory container= new XmlBeanFactory(resource);
        Student student =container.getBean("student", Student.class);

        //Using ApplicationContext
//        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
//        Student student =(Student) context.getBean("student");
        System.out.println("Name: "+student.getName());
        System.out.println("Age: "+student.getAge());
        System.out.println(student.getAddress());

    }
}
