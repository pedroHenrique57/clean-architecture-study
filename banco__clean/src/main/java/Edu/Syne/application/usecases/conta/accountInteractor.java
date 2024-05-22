package Edu.Syne.application.usecases.conta;

import Edu.Syne.application.entities.accounts.accountBusinessRule;
import Edu.Syne.application.entities.clientBusinessRule;
import Edu.Syne.application.usecases.conta.gateway.accountGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class accountInteractor implements accountInterface {
  public accountGateway accountGateway;

  @Autowired
  public accountInteractor(accountGateway accountGateway) {
    this.accountGateway = accountGateway;
  }

  @Override
  public void createAccount(accountBusinessRule account) {
    this.accountGateway.createAccount(account);
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