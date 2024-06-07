package example;

public class Book {
    public Book() {
        System.out.println("Book constructor");
    }
    //instance method
    public NoteBook createInstance(){
        return new NoteBook();
    }
}
