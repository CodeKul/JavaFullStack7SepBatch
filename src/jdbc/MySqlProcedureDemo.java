package jdbc;

import java.sql.*;

/**
 * mysql> delimiter /
 * mysql>  create procedure getAll()
 *     ->   begin
 *     ->   select * from student;
 *     -> end
 *     -> /
 * Query OK, 0 rows affected (0.02 sec)
 */
public class MySqlProcedureDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/Java7Sept";
        String username = "root";
        String password = "Codekul@123";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);
        CallableStatement cs = con.prepareCall("{call getAll()}");
        ResultSet rs = cs.executeQuery();
        while (rs.next()){
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getInt(3));
            System.out.println(rs.getString(4));
            System.out.println(rs.getString(5));

        }
        con.close();

    }
}
