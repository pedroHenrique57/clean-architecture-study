package Edu.Syne.application.usecases.conta.gateway;

import Edu.Syne.application.entities.accounts.accountBusinessRule;
import Edu.Syne.application.entities.accounts.checkingAccountBusinessRule;
import Edu.Syne.application.entities.accounts.savingsAccountBusinessRule;
import Edu.Syne.domain.entities.checkingAccountRepositoryEntity;
import Edu.Syne.domain.entities.savingsAccountRepositoryEntity;
import Edu.Syne.infrastructure.rowMappers.checkingAccountRepositoryEntityMapper;
import Edu.Syne.infrastructure.rowMappers.savingsAccountRepositoryEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class accountRepositoryGateway implements accountGateway {

  private final JdbcTemplate template;


  @Autowired
  public accountRepositoryGateway(JdbcTemplate template) {
    this.template = template;
  }

  @Override
  public UUID createAccount(accountBusinessRule account) throws DataAccessException, IllegalArgumentException {
    String sql;
    UUID uuid = UUID.randomUUID();

    // Try to define which sql to use according to the type of account
    if (account instanceof checkingAccountBusinessRule) {
      sql = "INSERT INTO checking__account (id__checking__account, balance) values (?, ?)";
    } else if (account instanceof savingsAccountBusinessRule) {
      sql = "INSERT INTO savings__account (id__savings__account, balance) values (?, ?)";
    } else {
      throw new IllegalArgumentException("Account not supported");
    }

    // Try to run the sql code
    this.template.update(sql, uuid.toString(), 0);

    // Returns the UUID to assign to a client
    return uuid;
  }

  @Override
  public void updateAccount(accountBusinessRule account) throws DataAccessException, IllegalArgumentException {
    String sql;
    checkingAccountRepositoryEntity persistenceCheckingAccount;
    savingsAccountRepositoryEntity persistenceSavingsAccount;

    // Verify if UUID have the right size to work to optimize time
    if (account.getId__account().length() != 36) {
      throw new IllegalArgumentException("Account UUID have to be 36 characters");
    }

    // Try to define which sql to use and what entity use according to the type of account
    if (account instanceof checkingAccountBusinessRule) {
      sql = "UPDATE checking__account SET balance = ? WHERE id__checking__account = ?";
      persistenceCheckingAccount = new checkingAccountRepositoryEntity();
      persistenceCheckingAccount.setId__checking_account(account.getId__account());
      persistenceCheckingAccount.setBalance(account.getBalance());
    } else if (account instanceof savingsAccountBusinessRule) {
      sql = "UPDATE savings__account SET balance = ? WHERE id__savings__account = ?";
      persistenceSavingsAccount = new savingsAccountRepositoryEntity();
      persistenceSavingsAccount.setId__savings_account(account.getId__account());
      persistenceSavingsAccount.setBalance(account.getBalance());
    } else {
      throw new IllegalArgumentException("Account not supported");
    }

    template.update(sql, account.getBalance(), account.getId__account());
  }

  @Override
  public void deleteAccount(accountBusinessRule account) throws DataAccessException, IllegalArgumentException {
    String sql;

    // Verify if UUID have the right size to work to optimize time
    if (account.getId__account().length() != 36) {
      throw new IllegalArgumentException("Account UUID have to be 36 characters");
    }

    // Try to define which sql to use according to the type of account
    if (account instanceof checkingAccountBusinessRule) {
      sql = "DELETE FROM checking__account WHERE id__checking__account = ?";
    } else if (account instanceof savingsAccountBusinessRule) {
      sql = "DELETE FROM savings__account WHERE id__savings__account = ?";
    } else {
      throw new IllegalArgumentException("Account not supported");
    }

    template.update(sql, account.getId__account());
  }

  @Override
  public Object findAccountById(accountBusinessRule account) throws DataAccessException, IllegalArgumentException {
    String sql;

    // Verify if UUID have the right size to work to optimize time
    if (account.getId__account().length() != 36) {
      throw new IllegalArgumentException("Account UUID have to be 36 characters");
    }

    // Try to define which sql to use and return a different bank entity representation according to the type of account
    if (account instanceof checkingAccountBusinessRule) {
      sql = "SELECT * FROM checking__account WHERE id__checking__account = ?";
      return template.queryForObject(sql, new Object[]{account.getId__account()}, new checkingAccountRepositoryEntityMapper());
    } else if (account instanceof savingsAccountBusinessRule) {
      sql = "SELECT * FROM savings__account WHERE id__savings__account = ?";
      return template.queryForObject(sql, new Object[]{account.getId__account()}, new savingsAccountRepositoryEntityMapper());
    } else {
      throw new IllegalArgumentException("Account not supported");
    }
  }

  @Override
  public List<?> findAllAccounts(accountBusinessRule account) throws DataAccessException, IllegalArgumentException {
    String sql;

    // Try to define which sql to use according to the type of account
    if (account instanceof checkingAccountBusinessRule) {
      sql = "SELECT * FROM checking__account";
      return template.query(sql, new checkingAccountRepositoryEntityMapper());
    } else if (account instanceof savingsAccountBusinessRule) {
      sql = "SELECT * FROM savings__account";
      return template.query(sql, new savingsAccountRepositoryEntityMapper());
    } else {
      throw new IllegalArgumentException("Account not supported");
    }
  }
}
