package Edu.Syne.application.usecases.client.gateway;

import Edu.Syne.application.entities.clientBusinessRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class clientRepositoryGateway implements clientGateway {

  JdbcTemplate template;

  @Autowired
  public clientRepositoryGateway(JdbcTemplate template) {
    this.template = template;
  }

  @Override
  public void createClient(clientBusinessRule client) {
    try {
      if (client.getId__savings__account() == null) {
        String sql = "INSERT INTO client (name, id__checking__account) values (?, ?)";

        this.template.update(sql, client.getName(), client.getId__checking__account());
      } else {
        String sql = "INSERT INTO client (name, id__checking__account, id__savings__account) values (?, ?, ?)";

        this.template.update(sql, client.getName(), client.getId__checking__account(), client.getId__savings__account());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void readClient(clientBusinessRule client) {
  }

  @Override
  public void updateClient(clientBusinessRule client) {
  }

  @Override
  public void deleteClient(clientBusinessRule client) {
  }

  @Override
  public clientBusinessRule findClientById(int id) {
    return null;
  }

  @Override
  public ArrayList<clientBusinessRule> findAllClients() {
    return null;
  }
}
