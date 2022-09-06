import java.util.ArrayList;
import java.util.Date;

public class BeanTester {

    public static void main(String[] arg) {
        Album album1 = new Album();
        Quote quote1 = new Quote();
        Author author1 = new Author();
        Date releaseDate1 = new Date("May 18, 2009");
        Album album2 = new Album();
        Quote quote2 = new Quote();
        Author author2 = new Author();
        Date releaseDate2 = new Date("June 15, 1997");
        Album album3 = new Album();
        Quote quote3 = new Quote();
        Author author3 = new Author();
        Date releaseDate3 = new Date("January 1, 2016");

        author1.setId(1);
        author1.setFirstName("Javier");
        author1.setLastName("Ruedas");
        author2.setId(2);
        author2.setFirstName("Timothy");
        author2.setLastName("Constance");
        author3.setId(3);
        author3.setFirstName("Margret");
        author3.setLastName("Thatcher");

        quote1.setId(1);
        quote1.setAuthor(author1);
        quote1.setContent("Supercalifragilisticexpialidocious");
        quote2.setId(2);
        quote2.setAuthor(author2);
        quote2.setContent("This is a quote");
        quote3.setId(3);
        quote3.setAuthor(author3);
        quote3.setContent("This is another quote");

        album1.setId(1);
        album1.setArtist("Passion Pit");
        album1.setName("Manners");
        album1.setReleaseDate(releaseDate1);
        album1.setSales(0.5);
        album1.setGenre("alternative/indie, electropop");
        album2.setId(2);
        album2.setArtist("Band Name Extraordinaire");
        album2.setName("Album Name Extra Extraordinaire");
        album2.setReleaseDate(releaseDate2);
        album2.setSales(1.2);
        album2.setGenre("rock");
        album3.setId(3);
        album3.setArtist("Carrot Stick");
        album3.setName("Orange is Cool");
        album3.setReleaseDate(releaseDate3);
        album3.setSales(20.1);
        album3.setGenre("jazz, r&b");

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);

        for(Quote quote : quotes) {
            System.out.printf("%s %s said: %s. Pretty interesting.%n", quote.getAuthor().getFirstName(), quote.getAuthor().getLastName(), quote.getContent());
        }
    }
}
