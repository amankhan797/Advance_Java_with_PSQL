// JAva code to create an table with pre-defined name

import java.sql.*;
class PSQL_Connection_check {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        Statement stm = c.createStatement();
        stm.executeUpdate("create table tablename (ID int, NAME varchar(20))"); //you can add create any table you want in table name.
    }
}