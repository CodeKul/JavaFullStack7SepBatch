package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlBatchProcessingDemo {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/Java7Sept";
        String username = "root";
        String password = "Codekul@123";
        String insertQuery1 = "insert into student values(6,'Jaya',27,'M.Tech','Mumbai'); ";
        String insertQuery2 = "insert into student values(7,'Pooja',24,'B.Tech','Nagpur'); ";
        String insertQuery3 = "insert into student values(8,'Kavita',26,'B.E.','Vardha'); ";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);
        Statement statement = con.createStatement();
        statement.addBatch(insertQuery1);
        statement.addBatch(insertQuery2);
        statement.addBatch(insertQuery3);
        System.out.println("statement.executeBatch(): "+statement.executeBatch());
        con.close();
    }
}
