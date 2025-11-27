package nov27_25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBconnect {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/saturday?createDatabaseIfNotExist=true",
                "root",
                "root"
            );

            Statement stmt = con.createStatement();

            stmt.executeUpdate("DROP TABLE IF EXISTS Worker");

            String createTable =
                "CREATE TABLE IF NOT EXISTS Worker (" +
                "id INT PRIMARY KEY, " +
                "name VARCHAR(50), " +
                "dept VARCHAR(50), " +
                "position VARCHAR(50), " +
                "salary DOUBLE)";
            stmt.executeUpdate(createTable);

            stmt.executeUpdate(
                "INSERT INTO Worker (id, name, dept, position, salary) VALUES " +
                "(1,'Adib','IT','Developer',35000), " +
                "(2,'Kavi','HR','Manager',42000)," +
                "(3,'Gopi','IT','Developer',55000)"
            );

            ResultSet rs = stmt.executeQuery("SELECT * FROM Worker");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + "  " +
                    rs.getString("name") + "  " +
                    rs.getString("dept") + "  " +
                    rs.getString("position") + "  " +
                    rs.getDouble("salary")
                );
            }

            con.close();

        } catch (Exception e) {
            System.out.println("Dear customer, please check your program");
            e.printStackTrace();
        }
    }
}
