package jdbc;

import java.sql.*;

public class MysqlDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/Java7Sept";
        String username = "root";
        String password = "Codekul@123";
        String selectAll = "select * from student";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);
        Statement statement = con.createStatement();
        ResultSet  rs = statement.executeQuery(selectAll);
        while (rs.next()){
            System.out.println("Roll No "+rs.getInt(1));
            System.out.println("Name "+rs.getString(2));
            System.out.println("Age "+rs.getInt(3));
            System.out.println("Class "+rs.getString(4));
            System.out.println("City "+rs.getString(5));
        }
        con.close();

    }
}
