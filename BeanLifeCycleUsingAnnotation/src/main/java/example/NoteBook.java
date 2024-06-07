package example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class NoteBook {
    @Value("200")
    int price;

    public void setPrice(int price) {
        this.price = price;
    }
    @PostConstruct
    public void start(){
        System.out.println("start method in NoteBook");
    }
    @PreDestroy
    public void end(){
        System.out.println("end method in Notebook");
    }
    @Override
    public String toString() {
        return "price: "+price;
    }
}
