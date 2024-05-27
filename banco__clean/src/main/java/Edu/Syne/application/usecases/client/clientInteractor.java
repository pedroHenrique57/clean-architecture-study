package Edu.Syne.application.usecases.client;

import Edu.Syne.application.entities.accounts.accountBusinessRule;
import Edu.Syne.application.entities.accounts.checkingAccountBusinessRule;
import Edu.Syne.application.entities.accounts.savingsAccountBusinessRule;
import Edu.Syne.application.entities.clientBusinessRule;
import Edu.Syne.application.usecases.accounts.accountEnum.accountType;
import Edu.Syne.application.usecases.client.gateway.clientGateway;
import Edu.Syne.application.usecases.client.gateway.clientRepositoryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class clientInteractor implements clientInterface {

  private final clientGateway clientGateway;

  @Autowired
  public clientInteractor(clientRepositoryGateway clientGateway) {
    this.clientGateway = clientGateway;
  }

  //  Client CRUD

  @Override
  public void createClient(clientBusinessRule client, accountType accountType) throws IllegalArgumentException, DataAccessException {
    this.clientGateway.createClient(client, accountType);
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

  // Checking Account Manipulation

  @Override
  public void checkingAccountWithdraw(checkingAccountBusinessRule account) {

  }

  @Override
  public void checkingAccountDeposit(checkingAccountBusinessRule account) {

  }

  @Override
  public void checkingAccountTransfer(checkingAccountBusinessRule account, accountBusinessRule destinationAccount) {

  }

  @Override
  public void checkingAccountConsult(checkingAccountBusinessRule account) {

  }

  // Savings Account Manipulation

  @Override
  public void savingsAccountWithdraw(savingsAccountBusinessRule account) {

  }

  @Override
  public void savingsAccountDeposit(savingsAccountBusinessRule account) {

  }

  @Override
  public void savingsAccountTransfer(savingsAccountBusinessRule account, accountBusinessRule destinationAccount) {

  }

  @Override
  public void savingsAccountConsult(savingsAccountBusinessRule account) {

  }
}
