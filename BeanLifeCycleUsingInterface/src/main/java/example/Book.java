package example;

public class Book {
    int price;

    public void setPrice(int price) {
        System.out.println("Setting Book price...");
        this.price = price;
    }
    public void init(){
        System.out.println("init method in Book");
    }
    public void destroy(){
        System.out.println("destroy method in Book");
    }

    @Override
    public String toString() {
        return "Book price: "+price;
    }
}
