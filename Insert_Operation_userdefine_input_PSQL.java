// JAva code to ask a user how many rows they want to insert into a table and then proceed to insert them.

import java.sql.*;
import java.util.Scanner;
class PSQL_Connection_check {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");        
        Scanner obj=new Scanner(System.in);
        System.out.print("How may records do you wanna Insert: ");
        int records=obj.nextInt();
        try{
        Statement stm = c.createStatement();
        for(int i=0; i<records; i++){
            System.out.println("Enter ID:");
            int id=obj.nextInt();
            System.out.println("Enter name:");
            String name=obj.next();
            stm.executeUpdate("insert into student values("+ id +",'"+name+"')");
        }
        }catch(Exception e){
            System.out.print(e);
        }
        System.out.print(records + "Row Inserted");
    }
}