import java.io.Serializable;

public class Album implements Serializable {
    private long id;
    private String artist;
    private String name;
    private int releaseDate;
    private float sales;
    private String genre;

    public Album() {}

    public long getId() {
        return this.id;
    }

    public String getArtist() {
        return this.artist;
    }

    public String getName() {
        return this.name;
    }

    public int getRelease_date() {
        return this.releaseDate;
    }

    public float getSales() {
        return this.sales;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setSales(float sales) {
        this.sales = sales;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}