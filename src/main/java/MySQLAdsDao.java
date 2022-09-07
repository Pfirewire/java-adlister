import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads{
    private Connection connection;

    public MySQLAdsDao() throws SQLException {
        if(connection == null) {
            Config config = new Config();
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getURL(),
                    config.getUsername(),
                    config.getPassword()
            );
        }
    }

    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM ads");
            while (rs.next()) {
                ads.add(new Ad(rs.getLong("id"), rs.getLong("user_id"), rs.getString("title"), rs.getString("description")));
            }
            return ads;
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e);
        }
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        String query = "INSERT INTO ads (user_id, title, description) VALUES (" + ad.getUserId() + ", '" + ad.getTitle() + "', '" + ad.getDescription() + "')";
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            if(rs.next()) {
                return rs.getLong(1);
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e);
        }
        return null;
    }
}
