package example;

public class NoteBook {
    int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        System.out.println("setting notebook price");
        this.price = price;
    }
    public void hey(){
        System.out.println("Inside intit() method");
    }
    public void bye(){
        System.out.println("Inside Notebook destroy() method");
    }
    @Override
    public String toString() {
        return "Book price: "+price;
    }
}
