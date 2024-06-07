package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book.getName());
        System.out.println(book.getAuthorName());
        System.out.println(book.hashCode());
        Book book1 = context.getBean("book", Book.class);
        System.out.println(book1.hashCode());
    }
}
