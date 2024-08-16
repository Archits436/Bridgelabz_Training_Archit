import java.sql.*;

public class InsertData {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/insurance_db";
        String username = "postgres";
        String password = "Archit@436";
        String query = "insert into customers (customer_id, first_name, last_name, email, contact_number, date_of_birth) values (?, ?, ?, ?, ?, ?)";

        int customer_id = 11;
        String first_name = "Birla";
        String last_name = "Don";
        String email = "johndoe@example.com";
        String contact_number = "555-9876";
        Date date_of_birth = Date.valueOf("2002-01-21");

        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement st = con.prepareStatement(query);) {
            System.out.println("Connection Established");
            st.setInt(1, customer_id);
            st.setString(2, first_name);
            st.setString(3, last_name);
            st.setString(4, email);
            st.setString(5, contact_number);
            st.setDate(6, date_of_birth);

            int rowsAffected = st.executeUpdate();

            if(rowsAffected > 0) {
                System.out.println("Record inserted successfully!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
