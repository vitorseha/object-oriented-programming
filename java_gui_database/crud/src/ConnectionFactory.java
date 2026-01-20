import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private String user = "root";
    private String password = "admin";
    private String host = "localhost";
    private String port = "3306";
    private String database = "GIT";

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://" + host + ":" + port + "/" + database +
                "?useSSL=false&serverTimezone=UTC",
                user,
                password
            );
        } catch (Exception e) {
            throw new RuntimeException("Erro ao conectar no banco", e);
        }
    }

}

/*
    CREATE TABLE PERSON (
        id_person INT AUTO_INCREMENT PRIMARY KEY,
        nm_person VARCHAR(100),
        nb_phone VARCHAR(20),
        ds_email VARCHAR(100)
    );
*/