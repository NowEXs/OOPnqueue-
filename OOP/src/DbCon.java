import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DbCon {
    private static final String PROPERTIES_FILE = "database.properties";

    public static Connection getConnection() throws SQLException, IOException {
        Properties props = new Properties();
        try (InputStream in = DbCon.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE)) {
            props.load(in);
        }

        String url = props.getProperty("db.url");
        String user = props.getProperty("db.user");
        String password = props.getProperty("db.password");

        return DriverManager.getConnection(url, user, password);
    }

    public static PreparedStatement prepareStatement(String sql) throws SQLException, IOException {
        Connection connection = getConnection();
        return connection.prepareStatement(sql);
    }
}