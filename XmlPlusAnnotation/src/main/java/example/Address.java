package example;

public class Address {
    int sector;
    String city;
    String state;

    public Address() {
    }

    public Address(int sector, String city, String state) {
        this.sector = sector;
        this.city = city;
        this.state = state;
    }
    public String toString() {
        return sector+" "+city+" "+state;
    }
}
