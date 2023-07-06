import java.sql.*;
class PSQL_Connection_check {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        if (c != null) {
            System.out.print("Connection Done");
        } else {
            System.out.print("Not Connected");
        }
    }
}