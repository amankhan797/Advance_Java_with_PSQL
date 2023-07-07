import java.sql.*;
import java.util.Scanner;
class ABC {
    public static void main(String[] Args) throws Exception {
        int choice;
        String tablename;
        String tmp_table;
        String tmp_table2;
        Class.forName("org.postgresql.Driver");
        Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        Scanner obj = new Scanner(System.in);
        System.out.println("-----------Enter your choice-----------");
        System.out.println("1 for Create | 2 for Read | 3 for Insert | 4 for Update | 5 for Delete");
        System.out.print(" : ");
        choice = obj.nextInt();
        try {
            if (choice == 1) {
                System.out.print("Enter table name :");
                tablename = obj.next();
                Statement stm = c.createStatement();
                stm.executeUpdate("create table " + tablename + " (ID int, NAME varchar(20))");
                System.out.print("Table created ");

            } else if (choice == 2) {

                System.out.print("Enter table name :");
                tmp_table = obj.next();
                Statement stm = c.createStatement();
                ResultSet result = stm.executeQuery("select * from " + tmp_table);
                while (result.next()) {
                    System.out.print(result.getString("ID") + " ");
                    System.out.println(result.getString("NAME"));
                }
            } else if (choice == 3) {
                System.out.print("Enter table name:");
                tmp_table2 = obj.next();
                System.out.print("Enter Student ID:");
                int ID = obj.nextInt();
                System.out.print("Enter Student Name:");
                String NAME = obj.next();
                Statement stm = c.createStatement();
                stm.executeUpdate("insert into " + tmp_table2 + " values(" + ID + ",'" + NAME + "')");
                System.out.print("Row Inserted :)");
            } else if (choice == 4) {
            	String tmp_table3;
                System.out.print("Enter table name which you want to update:");
                tmp_table3=obj.next();
                Statement stm = c.createStatement();
                ResultSet result =stm.executeQuery("select * from " + tmp_table3);
                ResultSetMetaData rsmd=result.getMetaData();
                int clmncnt=rsmd.getColumnCount();
                System.out.println("There are "+clmncnt+" column in "+tmp_table3);
                for(int i=1;i<=clmncnt;i++) {
                	System.out.print(rsmd.getColumnName(i)+" ");                	
                }
                System.out.println();
                System.out.print("Which column you want to Update :");
                String Column_name=obj.next();
                System.out.print("What is the Updated "+Column_name+" :");
                String content=obj.next();
                System.out.print("Please select column for condition :");
                String Condition_coulmn=obj.next();
                System.out.print("Specify your Condition here :");
                int condition=obj.nextInt();
                stm.executeUpdate("update "+tmp_table3+" set "+Column_name+" = '"+content+"' where "+Condition_coulmn+" = "+condition+" ");
                System.out.print("Table Updated !!!");  
            } else if (choice == 5) {
                System.out.println("from Which table you want to delete? :");
                String tmp_table4=obj.next();
                Statement stm = c.createStatement();
                ResultSet result =stm.executeQuery("select * from " + tmp_table4);
                ResultSetMetaData rsmd=result.getMetaData();
                int clmncnt=rsmd.getColumnCount();
                System.out.println("There are "+clmncnt+" column in "+tmp_table4);
                for(int i=1;i<=clmncnt;i++) {
                	System.out.print(rsmd.getColumnName(i)+" ");                	
                }
                System.out.println();
                System.out.print("Please select column for condition :");
                String Condition_coulmn=obj.next();
                System.out.print("Specify your Condition here :");
                int condition=obj.nextInt();
                stm.executeUpdate("delete from "+tmp_table4+" where "+Condition_coulmn+" = "+condition);
                System.out.print("Row Deleted !!!");
            } else {
                System.out.print("Please Enter Valid Choice");
            }
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}