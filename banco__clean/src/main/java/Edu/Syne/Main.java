package Edu.Syne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLException;

@SpringBootApplication
public class Main {
  public static void main(String[] args) throws SQLException {
    ApplicationContext application = SpringApplication.run(Main.class, args);
  }
}