// Java code to Select(Extract) the data from table, table name given by user.

import java.sql.*;
import java.util.Scanner;

class ABC {
    public static void main(String[] args) throws Exception {
        String Table;
        Scanner obj = new Scanner(System.in);
        Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        System.out.print("Enter table name :");
        Table = obj.next();
        Statement stm = c.createStatement();
        ResultSet result = stm.executeQuery("select * from " + Table);
        while (result.next()) {
            System.out.print(result.getString("ID") + " ");
            System.out.println(result.getString("NAME"));
        }
        obj.close();
    }
}