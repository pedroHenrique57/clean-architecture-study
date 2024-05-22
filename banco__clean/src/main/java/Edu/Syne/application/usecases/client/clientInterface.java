package Edu.Syne.application.usecases.client;

import Edu.Syne.application.entities.accounts.accountBusinessRule;
import Edu.Syne.application.entities.accounts.checkingAccountBusinessRule;
import Edu.Syne.application.entities.accounts.savingsAccountBusinessRule;
import Edu.Syne.application.entities.clientBusinessRule;

import java.util.ArrayList;

public interface clientInterface {

  //  Client CRUD

  public void createClient(clientBusinessRule client);

  public void readClient(clientBusinessRule client);

  public void updateClient(clientBusinessRule client);

  public void deleteClient(clientBusinessRule client);

  public clientBusinessRule findClientById(int id);

  public ArrayList<clientBusinessRule> findAllClients();


  // Checking Account Manipulation

  public void checkingAccountWithdraw(checkingAccountBusinessRule account);

  public void checkingAccountDeposit(checkingAccountBusinessRule account);

  public void checkingAccountTransfer(checkingAccountBusinessRule account, accountBusinessRule destinationAccount);

  public void checkingAccountConsult(checkingAccountBusinessRule account);

  // Savings Account Manipulation

  public void savingsAccountWithdraw(savingsAccountBusinessRule account);

  public void savingsAccountDeposit(savingsAccountBusinessRule account);

  public void savingsAccountTransfer(savingsAccountBusinessRule account, accountBusinessRule destinationAccount);

  public void savingsAccountConsult(savingsAccountBusinessRule account);
}
