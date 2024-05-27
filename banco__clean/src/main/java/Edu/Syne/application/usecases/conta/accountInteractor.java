package Edu.Syne.application.usecases.conta;

import Edu.Syne.application.entities.accounts.accountBusinessRule;
import Edu.Syne.application.usecases.conta.gateway.accountGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class accountInteractor implements accountInterface {
  public accountGateway accountGateway;

  @Autowired
  public accountInteractor(accountGateway accountGateway) {
    this.accountGateway = accountGateway;
  }

  @Override
  public void createAccount(accountBusinessRule account) throws DataAccessException, IllegalArgumentException {
    accountGateway.createAccount(account);
  }


  @Override
  public void updateAccount(accountBusinessRule account) throws DataAccessException, IllegalArgumentException {
    accountGateway.updateAccount(account);
  }

  @Override
  public void deleteAccount(accountBusinessRule account) throws DataAccessException, IllegalArgumentException {
    accountGateway.deleteAccount(account);
  }

  @Override
  public Object findAccountById(accountBusinessRule account) throws DataAccessException, IllegalArgumentException {
    return accountGateway.findAccountById(account);
  }

  @Override
  public List<?> findAllAccounts(accountBusinessRule account) throws DataAccessException, IllegalArgumentException {
    return accountGateway.findAllAccounts(account);
  }
}