import java.sql.*;

public class EmployeeManager {
    public static void main(String[] args) throws Exception {

        Connection con = DBConnection.getConnection();

        // CREATE TABLE
        con.createStatement().execute(
            "CREATE TABLE IF NOT EXISTS employee(id INT, name VARCHAR(50), salary DOUBLE)"
        );

        // INSERT
        PreparedStatement ps = con.prepareStatement("INSERT INTO employee VALUES(?,?,?)");
        ps.setInt(1, 1);
        ps.setString(2, "John");
        ps.setDouble(3, 35000);
        ps.executeUpdate();

        // READ
        ResultSet rs = con.createStatement()
                .executeQuery("SELECT * FROM employee WHERE salary > 30000");

        while (rs.next()) {
            System.out.println(rs.getString("name"));
        }

        // UPDATE
        con.createStatement().executeUpdate(
            "UPDATE employee SET salary = salary * 1.10 WHERE id = 1"
        );

        // DELETE
        con.createStatement().executeUpdate(
            "DELETE FROM employee WHERE salary < 15000"
        );

        con.close();
    }
}