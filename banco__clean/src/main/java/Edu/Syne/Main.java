package Edu.Syne;

import Edu.Syne.external.DB.MySQLConnector;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
  public static void main(String[] args) throws SQLException, IOException {

    Connection db = MySQLConnector.openConnection();

    System.out.println(db.createStatement().execute("select * from banco1"));
  }
}