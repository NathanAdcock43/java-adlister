import java.sql.*;
import com.mysql.cj.jdbc.Driver;



public class DbSetup {

    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection
                ("jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSl=false" +
                                "&allowPublicKeyRetrieval=true",
                "root",
                "codeup"
        );
    }
}
