package example;

import org.springframework.stereotype.Component;

@Component
public class Lion implements AnimalType{
    @Override
    public void name() {
        System.out.println("Lion");
    }
}
