import java.sql.*;
import com.mysql.cj.jdbc.Driver;



public class DbSetup {
//connection object
    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection
                ("jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSl=false" +
                                "&allowPublicKeyRetrieval=true",
                "root",
                "codeup"
        );


//statement object (initialize it)
    Statement statement = connection.createStatement();

    ResultSet selectResults = statement.executeQuery("SELECT * FROM products");

    while(selectResults.next()){
        System.out.println("Here's a product:");
        System.out.println("name : " + selectResults.getString("name") + "\n");
        System.out.println("price: $" + selectResults.getInt("price") + "\n");

        String insertQuery = "INSERT INTO products (name, price) VALUE ('nailgun', 250)";

        Statement insertStatement = connection.createStatement();



        insertStatement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
        ResultSet insertResults = insertStatement.getGeneratedKeys();

        if(insertResults.next()){
            System.out.println("Administrator: A new item has been created with the id of : " + insertResults.getLong(1));
        }
    }
    }





}
