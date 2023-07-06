// JAva code to insert 1 row in a table, basically it's an Insertion operatiokn.

import java.sql.*;
class PSQL_Connection_check {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");        
        try{
        Statement stm = c.createStatement();
        stm.executeUpdate("insert into student values(6,'Vicky')");
        }catch(Exception e){
            System.out.print(e);
        }
        System.out.print("Row Inserted");
    }
}