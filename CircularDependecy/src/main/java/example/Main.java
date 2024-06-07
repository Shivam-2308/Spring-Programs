package example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
        School sh =context.getBean(School.class);
        Student st =context.getBean(Student.class);
        st.print();

    }
}
