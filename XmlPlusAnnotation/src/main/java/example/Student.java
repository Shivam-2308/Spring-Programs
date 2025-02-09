package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Student {
//    @Autowired
    private Address address;
//    @Autowired
    private Address2 address2;
    @Value("Shivam")
    String name;
//    @Autowired
    public Student() {
        System.out.println("no-arg constructor");
    }
    @Autowired
    public Student(Address address, Address2 address2) {
        System.out.println("parametrized constructor");
        this.address = address;
        this.address2 = address2;
    }

    public Student(String name) {
        this.name = name;
        System.out.println("This is String constructor");
    }
    @Autowired
    public void setAddress(Address address,Address2 address2) {
        System.out.println("Setter methods for addresses");
        this.address = address;
        this.address2 = address2;
    }

    public Address getAddress() {
        return address;
    }

    public Address2 getAddress2() {
        return address2;
    }

    public String getName() {
        return name;
    }
}
