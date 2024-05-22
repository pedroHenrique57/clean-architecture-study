package Edu.Syne.application.usecases.conta.gateway;

import Edu.Syne.application.entities.accounts.accountBusinessRule;
import Edu.Syne.application.entities.accounts.checkingAccountBusinessRule;
import Edu.Syne.application.entities.accounts.savingsAccountBusinessRule;
import Edu.Syne.application.entities.clientBusinessRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class accountRepositoryGateway implements accountGateway {

  private final JdbcTemplate template;

  @Autowired
  public accountRepositoryGateway(JdbcTemplate template) {
    this.template = template;
  }

  @Override
  public void createAccount(accountBusinessRule account) {
    String sql;

    try {
      if (account instanceof checkingAccountBusinessRule) {
        sql = "INSERT INTO checking__account () values ()";
      } else if (account instanceof savingsAccountBusinessRule) {
        sql = "INSERT INTO savings__account () values ()";
      } else {
        throw new Exception();
      }
      this.template.update(sql);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  @Override
  public void readAccount(accountBusinessRule account) {

  }

  @Override
  public void updateAccount(accountBusinessRule account) {

  }

  @Override
  public void deleteAccount(accountBusinessRule account) {

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
