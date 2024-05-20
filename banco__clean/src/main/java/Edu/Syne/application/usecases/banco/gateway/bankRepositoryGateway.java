package Edu.Syne.application.usecases.banco.gateway;

import Edu.Syne.application.entities.bankBusinessRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class bankRepositoryGateway implements bankGateway {

  private final JdbcTemplate template;

  @Autowired
  public bankRepositoryGateway(JdbcTemplate template) {
    this.template = template;
  }

  @Override
  public void createBank(bankBusinessRule bank) {
    String sql = "INSERT INTO bank (name) values (?)";

    this.template.update(sql, bank.name());
  }

  @Override
  public ArrayList<bankBusinessRule> readBank() {

    return null;
  }

  @Override
  public void updateBank() {

  }

  @Override
  public void deleteBank() {

  }

  @Override
  public bankBusinessRule findBankById(int id) {

    return null;
  }

  @Override
  public ArrayList<bankBusinessRule> findAllBanks() {

    return null;
  }
}
