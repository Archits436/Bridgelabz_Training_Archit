import java.sql.*;

public class ExecuteQuery {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/insurance_db";
        String username = "postgres";
        String password = "Archit@436";
        String query = "select * from customers";

        try (Connection con = DriverManager.getConnection(url, username, password);
                PreparedStatement st = con.prepareStatement(query);
                ResultSet rs = st.executeQuery();) {
            System.out.println("Connection Established");
            int columns = rs.getMetaData().getColumnCount();
            for (int i = 1; i < columns; i++) {
                System.out.print(rs.getMetaData().getColumnName(i) + "\t");
            }
            System.out.println();
            while (rs.next()) {
                for(int i = 1; i <= columns; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
