import java.sql.*;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

//        import package
//        load and register
//        create connection
//        create statement
//        execute statement
//        process the results
//        close

        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String pass = "hateclcc";

//        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,user,pass);
        System.out.println("Connection done");

    }
}