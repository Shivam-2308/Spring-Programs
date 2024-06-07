package example;

public class Book {
    private Book() {
    }
    public static NoteBook createInstance(){
        return new NoteBook();
    }
}
