package example;

public class Student {
    private Address address;
    private String name;

    public Student() {
    }

    public Student(Address address, String name) {
        this.address = address;
        this.name = name;
        System.out.println("Inside student constructor Name: "+name);
    }

//    public Student(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("String setter");
    }

    public void setAddress(Address address) {
        System.out.println("setter");
        this.address = address;
    }
    public Address getAddress() {
        return address;
    }



}
