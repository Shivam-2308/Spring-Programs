package example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("100")
    int price;


    public void setPrice(int price) {
        this.price = price;
    }
    public void init(){
        System.out.println("Inside init method in Book");
    }
    public void destroy(){
        System.out.println("Inside destroy method in Book");
    }

    @Override
    public String toString() {
        return "price: "+price;
    }
}
