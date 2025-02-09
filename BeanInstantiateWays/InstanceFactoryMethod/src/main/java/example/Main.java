package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        NoteBook n = context.getBean("noteBook", NoteBook.class);
        System.out.println(n.getName());
    }
}
