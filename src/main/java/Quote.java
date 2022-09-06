import java.io.Serializable;

public class Quote implements Serializable {
    private long id;
    private String content;
    private Author author;

    public long getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
