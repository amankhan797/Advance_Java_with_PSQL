// JAva code to ask a user how many rows they want to insert into a table and then proceed to insert them.

import java.sql.*;
class PSQL_Connection_check {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        try{
        Statement stm = c.createStatement();
        stm.executeUpdate("update emp set name=Shifa where ID=7");        
        }catch(Exception e){
            System.out.print(e);
        }
        System.out.print("Record Updated");
    }
}