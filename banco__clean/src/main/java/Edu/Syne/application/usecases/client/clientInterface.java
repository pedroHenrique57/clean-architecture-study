package Edu.Syne.application.usecases.client;

import Edu.Syne.application.entities.accounts.accountBusinessRule;
import Edu.Syne.application.entities.accounts.checkingAccountBusinessRule;
import Edu.Syne.application.entities.accounts.savingsAccountBusinessRule;
import Edu.Syne.application.entities.clientBusinessRule;
import Edu.Syne.application.usecases.accounts.accountEnum.accountType;
import org.springframework.dao.DataAccessException;

import java.util.ArrayList;

interface clientInterface {

  //  Client CRUD

  void createClient(clientBusinessRule client, accountType accountType) throws IllegalArgumentException, DataAccessException;

  void readClient(clientBusinessRule client);

  void updateClient(clientBusinessRule client);

  void deleteClient(clientBusinessRule client);

  clientBusinessRule findClientById(int id);

  ArrayList<clientBusinessRule> findAllClients();


  // Checking Account Manipulation

  void checkingAccountWithdraw(checkingAccountBusinessRule account);

  void checkingAccountDeposit(checkingAccountBusinessRule account);

  void checkingAccountTransfer(checkingAccountBusinessRule account, accountBusinessRule destinationAccount);

  void checkingAccountConsult(checkingAccountBusinessRule account);

  // Savings Account Manipulation

  void savingsAccountWithdraw(savingsAccountBusinessRule account);

  void savingsAccountDeposit(savingsAccountBusinessRule account);

  void savingsAccountTransfer(savingsAccountBusinessRule account, accountBusinessRule destinationAccount);

  void savingsAccountConsult(savingsAccountBusinessRule account);
}
