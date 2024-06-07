package example;
import org.springframework.stereotype.Component;

import java.util.*;
@Component
public class Elephant implements AnimalType {

    @Override
    public void name() {
        System.out.println("Elephant");
    }
}
