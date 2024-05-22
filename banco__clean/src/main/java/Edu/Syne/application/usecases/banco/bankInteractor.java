package Edu.Syne.application.usecases.banco;

import Edu.Syne.application.entities.bankBusinessRule;
import Edu.Syne.application.usecases.banco.gateway.bankGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class bankInteractor implements bankInterface {

  private final bankGateway bankGateway;

  @Autowired
  public bankInteractor(bankGateway bankGateway) {
    this.bankGateway = bankGateway;
  }

  @Override
  public void createBank(bankBusinessRule bankEntity) {
    this.bankGateway.createBank(bankEntity);
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
