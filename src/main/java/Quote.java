import java.io.Serializable;

public class Quote implements Serializable {
    private long id;
    private String content;
    private long authorId;

    public long getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

    public long getAuthorId() {
        return this.authorId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }
}
