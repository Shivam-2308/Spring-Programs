package example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("21")
    int sector;
    @Value("Noida")
    String city;

    @Value("UP")
    String state;

    public Address() {
    }

    public Address(int sector, String city, String state) {
        this.sector = sector;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return sector+" "+city+" "+state;
    }
}
