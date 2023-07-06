// JAva code to update recor of an exesting table.

import java.sql.*;
class PSQL_Connection_check {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        try{
        Statement stm = c.createStatement();
        stm.executeUpdate("update student set name='Shifa' where ID=7");        
        }catch(Exception e){
            System.out.print(e);
        }
        System.out.print("Record Updated");
    }
}