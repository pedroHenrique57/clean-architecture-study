package Edu.Syne.application.usecases.conta.gateway;

import Edu.Syne.application.entities.accounts.accountBusinessRule;
import Edu.Syne.application.entities.clientBusinessRule;

import java.util.ArrayList;

public interface accountGateway {

  public void createAccount(accountBusinessRule account);

  public void readAccount(accountBusinessRule account);

  public void updateAccount(accountBusinessRule account);

  public void deleteAccount(accountBusinessRule account);

  public clientBusinessRule findClientById(int id);

  public ArrayList<clientBusinessRule> findAllClients();
}
