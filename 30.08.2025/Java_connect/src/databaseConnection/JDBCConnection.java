package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/saturday", "root", "root");

            String insertQuery = "INSERT INTO Worker (WORKER_ID, FIRST_NAME, LAST_NAME, DEPARTMENT, SALARY) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement psInsert = con.prepareStatement(insertQuery);
            psInsert.setInt(1, 6);
            psInsert.setString(2, "Kiran");
            psInsert.setString(3, "Patel");
            psInsert.setString(4, "Finance");
            psInsert.setDouble(5, 72000.00);
            psInsert.executeUpdate();
            System.out.println("Record inserted!");

            String selectQuery = "SELECT * FROM Worker";
            ResultSet rs = con.createStatement().executeQuery(selectQuery);
            System.out.println("\nWorker Table:");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("WORKER_ID") + " " +
                    rs.getString("FIRST_NAME") + " " +
                    rs.getString("LAST_NAME") + " " +
                    rs.getString("DEPARTMENT") + " " +
                    rs.getDouble("SALARY")
                );
            }

            String updateQuery = "UPDATE Worker SET SALARY=? WHERE WORKER_ID=?";
            PreparedStatement psUpdate = con.prepareStatement(updateQuery);
            psUpdate.setDouble(1, 75000.00);
            psUpdate.setInt(2, 6);
            psUpdate.executeUpdate();
            System.out.println("\nRecord updated!");

            String deleteQuery = "DELETE FROM Worker WHERE WORKER_ID=?";
            PreparedStatement psDelete = con.prepareStatement(deleteQuery);
            psDelete.setInt(1, 6);
            psDelete.executeUpdate();
            System.out.println("\nRecord deleted!");

            con.close();
        } catch (Exception e) {
            System.out.println("Error in CRUD operations!");
            e.printStackTrace();
        }
    }
}
