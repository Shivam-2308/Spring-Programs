package example;


import org.springframework.beans.factory.annotation.Value;

public class NoteBook {
    public NoteBook() {
        System.out.println("NoteBook constructor");
    }
    @Value("Python")
    private String name;

    public String getName() {
        return name;
    }
}
