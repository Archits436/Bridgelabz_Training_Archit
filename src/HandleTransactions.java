import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HandleTransactions {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/bank_db";
        String username = "postgres";
        String password = "Archit@436";

        Connection conn = null;
        PreparedStatement withdrawStmt = null;
        PreparedStatement depositStmt = null;

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established!");
            conn.setAutoCommit(false);

            String withdrawSQL = "update accounts set balance = balance - ? where account_id = ?";
            String depositSQL = "update accounts set balance = balance + ? where account_id = ?";
            withdrawStmt = conn.prepareStatement(withdrawSQL);
            depositStmt = conn.prepareStatement(depositSQL);

            withdrawStmt.setDouble(1, 100.00);
            withdrawStmt.setInt(2, 1);
            withdrawStmt.executeUpdate();

            depositStmt.setDouble(1, 100.00);
            depositStmt.setInt(2, 2);
            depositStmt.executeUpdate();

            conn.commit();
            System.out.println("Transaction completed successfully !");
        } catch (SQLException e) {
            if(conn != null) {
                try {
                    System.out.println("Rolling back transaction...");
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
            System.out.println("Transaction failed: " + e.getMessage());
        } finally {
            try {
                if (withdrawStmt != null) withdrawStmt.close();
                if (depositStmt != null) depositStmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}
