// JAva code to create an table with user-define name and column name.

import java.sql.*;
// import java.util.Scanner;
class PSQL_Connection_check {
    public static void main(String[] args) throws Exception {
        // int ID;
        Class.forName("org.postgresql.Driver");
        Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");        
        try{
        Statement stm = c.createStatement();
        stm.executeUpdate("insert in student values(6,'Vicky')");
        }catch(Exception e){
            System.out.print(e);
        }
        System.out.print("Row Inserted");
    }
}