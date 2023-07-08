// Java code to update the table specified by user with column name and condition.
import java.sql.*;
import java.util.Scanner;
class Update_table_user_define_PSQL {
    public static void main(String[] args) throws Exception {
        String Table;
        Scanner obj = new Scanner(System.in);
        Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        System.out.print("Enter table name which you want to update:");
        Table = obj.next();
        Statement stmt = c.createStatement();
        ResultSet result = stmt.executeQuery("select * from " + Table);
        ResultSetMetaData rsmd = result.getMetaData();
        int clmncnt = rsmd.getColumnCount();
        System.out.println("There are " + clmncnt + " column in " + Table);
        for (int i = 1; i <= clmncnt; i++) {
            System.out.print(rsmd.getColumnName(i) + " ");
        }
        System.out.println();
        System.out.print("Which column you want to Update :");
        String Column_name = obj.next();
        System.out.print("What is the Updated " + Column_name + " :");
        String content = obj.next();
        System.out.print("Please select column for condition :");
        String Condition_coulmn = obj.next();
        System.out.print("Specify your Condition here :");
        int condition = obj.nextInt();
        stmt.executeUpdate("update " + Table + " set " + Column_name + " = '" + content + "' where "
                + Condition_coulmn + " = " + condition + " ");
        System.out.print("Table Updated !!!");
    }
}