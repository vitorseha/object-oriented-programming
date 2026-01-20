import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Person {

    private int id;
    private String name;
    private String phone;
    private String email;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // INSERT
    public void insert() {
        String sql = "INSERT INTO T_PERSON (nm_person, nb_phone, ds_email) VALUES (?, ?, ?)";

        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.getConnection()) {

            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, email);
            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void update() {
        String sql =
                "UPDATE T_PERSON SET nm_person = ?, nb_phone = ?, ds_email = ? WHERE id_person = ?";

        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.getConnection()) {

            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, email);
            ps.setInt(4, id);
            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void delete() {
        String sql = "DELETE FROM T_PERSON WHERE id_person = ?";

        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.getConnection()) {

            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // LIST
    public void list() {
        String sql = "SELECT * FROM T_PERSON";

        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.getConnection()) {

            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_person");
                String name = rs.getString("nm_person");
                String phone = rs.getString("nb_phone");
                String email = rs.getString("ds_email");

                String message = String.format(
                        "ID: %d\nName: %s\nPhone: %s\nEmail: %s",
                        id, name, phone, email
                );

                JOptionPane.showMessageDialog(null, message);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
