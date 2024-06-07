package example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        //using xml
        Resource resource = new ClassPathResource("bean.xml");
        BeanFactory container = new XmlBeanFactory(resource);
        Student student =(Student) container.getBean("student");

        //using application context
//        ApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");
//        Student student =context.getBean("student",Student.class);
        System.out.println("Name is: "+student.getName());
        System.out.println("Roll num is: "+student.roll_num);
        System.out.println(student.getCollege());

    }
}
