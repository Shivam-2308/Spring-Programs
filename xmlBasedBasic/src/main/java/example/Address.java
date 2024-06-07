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

    public int getSector() {
        return sector;
    }

    public void setSector(int sector) {
        this.sector = sector;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "sector=" + sector +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
