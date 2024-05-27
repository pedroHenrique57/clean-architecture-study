package Edu.Syne.application.usecases.client.gateway;

import Edu.Syne.application.entities.accounts.checkingAccountBusinessRule;
import Edu.Syne.application.entities.accounts.savingsAccountBusinessRule;
import Edu.Syne.application.entities.clientBusinessRule;
import Edu.Syne.application.usecases.accounts.accountEnum.accountType;
import Edu.Syne.application.usecases.accounts.accountInteractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public class clientRepositoryGateway implements clientGateway {

  final JdbcTemplate template;
  final accountInteractor accountInteractor;

  @Autowired
  public clientRepositoryGateway(JdbcTemplate template, accountInteractor accountInteractor) {
    this.template = template;
    this.accountInteractor = accountInteractor;
  }

  @Override
  public void createClient(clientBusinessRule client, accountType accountType) throws IllegalArgumentException, DataAccessException {
    String sql;
    UUID clientId = UUID.randomUUID();
    UUID checkingAccountId;
    UUID savingsAccountId;
    checkingAccountBusinessRule checkingAccountBusinessRule = new checkingAccountBusinessRule();
    savingsAccountBusinessRule savingsAccountBusinessRule = new savingsAccountBusinessRule();


    try {
      // Verify is client name is empty
      if (client.getName().isEmpty()) {
        throw new IllegalArgumentException("Client name cannot be empty or null.");
      }

      // Try to define which sql to use and what entity use according to the type of account
      if (accountType == accountType.checking) {
        // define SQL
        sql = "INSERT INTO client (client.id__client, name, id__checking__account) values (?, ?, ?)";

        // Create and define the checking account entity
        checkingAccountId = accountInteractor.createAccount(accountType);
        checkingAccountBusinessRule.setId__account(checkingAccountId.toString());

        // Format the sql and run it in the database
        template.update(sql, clientId.toString(), client.getName(), checkingAccountBusinessRule.getId__account());
      } else if (accountType == accountType.savings) {
        // define SQL
        sql = "INSERT INTO client (id__client, name, id__checking__account, id__savings__account) values (?, ?, ?, ?)";

        // Create and define the checking account repository entity
        checkingAccountId = accountInteractor.createAccount(accountType.checking);
        checkingAccountBusinessRule.setId__account(checkingAccountId.toString());

        // Create and define the savings account repository entity
        savingsAccountId = accountInteractor.createAccount(accountType.savings);
        savingsAccountBusinessRule.setId__account(savingsAccountId.toString());

        // Format the sql and run it in the database
        this.template.update(sql, clientId.toString(), client.getName(), checkingAccountBusinessRule.getId__account(), savingsAccountBusinessRule.getId__account());
      } else {
        throw new IllegalArgumentException("Unsupported account type. use accountType.savings or accountType.checking");
      }
    } catch (Throwable e) {
      // Delete created accounts if client creation goes wrong
      accountInteractor.deleteAccount(checkingAccountBusinessRule);
      accountInteractor.deleteAccount(savingsAccountBusinessRule);
      throw new RuntimeException("Error while creating Client. Deleting accounts created. Error message: " + e.getMessage());
    }
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
}
