package example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //context.registerShutdownHook();  //no need of it when we explicitly close the context otherwise it is used to invoke destroy method
        Book b = context.getBean("book", Book.class);
        NoteBook n = context.getBean("notebook",NoteBook.class);
        System.out.println("printing Book details: ");
        System.out.println(b);
        System.out.println("printing Notebook details: ");
        System.out.println(n.price);
        context.close();
    }
}
