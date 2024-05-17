package Edu.Syne.application.usecases.banco.gateway;

import Edu.Syne.application.entities.Bank;
import Edu.Syne.domain.entities.BancoRepositoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class BancoRepositoryGateway implements BancoGateway {

  private final JdbcTemplate template;

  @Autowired
  public BancoRepositoryGateway(JdbcTemplate template) {
    this.template = template;
  }

  @Override
  public void createBank(BancoRepositoryEntity bank) {
    String sql = "INSERT INTO banco (nome) values (?)";

    this.template.update(sql, bank.getNome());
  }

  @Override
  public ArrayList<Bank> readBank() {

    return null;
  }

  @Override
  public void updateBank() {

  }

  @Override
  public void deleteBank() {

  }

  @Override
  public Bank findBankById(int id) {

    return null;
  }

  @Override
  public ArrayList<Bank> findAllBanks() {

    return null;
  }
}
