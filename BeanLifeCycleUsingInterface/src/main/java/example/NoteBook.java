package example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class NoteBook implements InitializingBean, DisposableBean {
    int price;

    public void setPrice(int price) {
        System.out.println("Setting NoteBook price...");
        this.price = price;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside init method of NoteBook");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside destroy method of NoteBook");
    }


}
