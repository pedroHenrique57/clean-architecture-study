package Edu.Syne.application.usecases.conta;

import Edu.Syne.application.entities.accounts.accountBusinessRule;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface accountInterface {

  void createAccount(accountBusinessRule account) throws DataAccessException, IllegalArgumentException;

  void updateAccount(accountBusinessRule account) throws DataAccessException, IllegalArgumentException;

  void deleteAccount(accountBusinessRule account) throws DataAccessException, IllegalArgumentException;

  Object findAccountById(accountBusinessRule account) throws DataAccessException, IllegalArgumentException;

  List<?> findAllAccounts(accountBusinessRule account) throws DataAccessException, IllegalArgumentException;
}
