package example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");
        context.registerShutdownHook();
        Book b =context.getBean("book", Book.class);
        NoteBook n = context.getBean("noteBook", NoteBook.class);
        System.out.println("Printing book details....");
        System.out.println(b);
        System.out.println("Printing noteBook detials.....");
        System.out.println(n);
    }
}
