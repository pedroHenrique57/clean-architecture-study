package Edu.Syne.external.DB;

import Edu.Syne.Main;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySQLConnector {

  public static Connection openConnection() throws IOException, SQLException {
    InputStream in = Main.class.getClassLoader().getResourceAsStream("database.properties");
    Properties prop = new Properties();
    prop.load(in);

    Connection connection = DriverManager.getConnection(
        prop.getProperty("db.url"),
        prop.getProperty("db.user"),
        prop.getProperty("db.password"));

    prop.clear();
    if (in != null) {
      in.close();
    }
    return connection;
  }
}
