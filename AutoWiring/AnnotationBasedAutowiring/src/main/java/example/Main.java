package example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AutoConfig.class);
        Student student =context.getBean(Student.class);
        System.out.println(student.getName());
        System.out.println(student.getAddress());
    }
}
