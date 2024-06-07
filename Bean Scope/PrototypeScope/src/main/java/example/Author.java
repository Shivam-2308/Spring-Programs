package example;

public class Author {
    public String authorName;

    public Author() {
        System.out.println("author constructor");
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }
}
