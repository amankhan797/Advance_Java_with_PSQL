// JAva code to create an table with user-define name.

import java.sql.*;
import java.util.Scanner;
class PSQL_Connection_check {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        String tablename;
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter table name:");
        tablename=obj.nextLine();
        Statement stm = c.createStatement();
        stm.executeUpdate("create table "+ tablename+"(ID int, NAME varchar(20))");
        System.out.print("Table Created :)");
    }
}