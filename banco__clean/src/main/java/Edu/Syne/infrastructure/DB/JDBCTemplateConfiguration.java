package Edu.Syne.infrastructure.DB;

import Edu.Syne.Main;
import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

@Configuration
public class JDBCTemplateConfiguration {

  @Bean
  public static MysqlDataSource dataSource() throws SQLException {
    Properties prop = new Properties();
    MysqlDataSource dataSource = new MysqlDataSource();

    try {
      InputStream in = Main.class.getClassLoader().getResourceAsStream("application.properties");
      prop.load(in);

      dataSource.setUrl(prop.getProperty("db.url"));
      dataSource.setUser(prop.getProperty("db.user"));
      dataSource.setPassword(prop.getProperty("db.password"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    return dataSource;
  }

  @Bean
  public JdbcTemplate jdbcTemplate(DataSource dataSource) {
    return new JdbcTemplate(dataSource);
  }
}