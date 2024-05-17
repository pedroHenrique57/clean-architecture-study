package Edu.Syne.application.usecases.conta.gateway;

import Edu.Syne.application.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ContaRepositoryGateway implements ContaGateway {

  private final JdbcTemplate template;

  @Autowired
  public ContaRepositoryGateway(JdbcTemplate template) {
    this.template = template;
  }

  @Override
  public void create(Client client) {
  }

  @Override
  public void read(Client client) {

  }

  @Override
  public void update(Client client) {

  }

  @Override
  public void delete(Client client) {

  }
}
