// Java code to delete an row from a given table name with spwcified condition.

import java.sql.*;
import java.util.Scanner;
class Delete_Query_PSQL {
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);
        Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");

        System.out.println("from Which table you want to delete? :");
        String tmp_table4 = obj.next();
        Statement stm = c.createStatement();
        ResultSet result = stm.executeQuery("select * from " + tmp_table4);
        ResultSetMetaData rsmd = result.getMetaData();
        int clmncnt = rsmd.getColumnCount();
        System.out.println("There are " + clmncnt + " column in " + tmp_table4);
        for (int i = 1; i <= clmncnt; i++) {
            System.out.print(rsmd.getColumnName(i) + " ");
        }
        System.out.println();
        System.out.print("Please select column for condition :");
        String Condition_coulmn = obj.next();
        System.out.print("Specify your Condition here :");
        int condition = obj.nextInt();
        stm.executeUpdate("delete from " + tmp_table4 + " where " + Condition_coulmn + " = " + condition);
        System.out.print("Row Deleted !!!");
        obj.close();
    }
}