package Edu.Syne.application.usecases.conta.gateway;

import Edu.Syne.application.entities.clientBusinessRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ContaRepositoryGateway implements accountGateway {

  private final JdbcTemplate template;

  @Autowired
  public ContaRepositoryGateway(JdbcTemplate template) {
    this.template = template;
  }

  @Override
  public void create(clientBusinessRule client) {
  }

  @Override
  public void read(clientBusinessRule client) {

  }

  @Override
  public void update(clientBusinessRule client) {

  }

  @Override
  public void delete(clientBusinessRule client) {

  }
}
