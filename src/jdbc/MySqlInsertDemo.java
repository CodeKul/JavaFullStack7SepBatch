package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySqlInsertDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Java7Sept";
        String username = "root";
        String password = "Codekul@123";
        String insertQuery = "insert into student values(4,'Vaibhav',27,'BE','Pune'); ";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement = con.prepareStatement(insertQuery);
            int n = preparedStatement.executeUpdate();
            System.out.println(n + " row/s updated");

        }catch (ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
