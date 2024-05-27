package Edu.Syne.application.usecases.accounts.gateway;

import Edu.Syne.application.entities.accounts.accountBusinessRule;
import Edu.Syne.application.usecases.accounts.accountEnum.accountType;
import org.springframework.dao.DataAccessException;

import java.util.List;
import java.util.UUID;

public interface accountGateway<T> {

  UUID createAccount(accountType accountType) throws DataAccessException, IllegalArgumentException;

  void updateAccount(accountBusinessRule account) throws DataAccessException, IllegalArgumentException;

  void deleteAccount(accountBusinessRule account) throws DataAccessException, IllegalArgumentException;

  Object findAccountById(accountBusinessRule account) throws DataAccessException, IllegalArgumentException;

  List<?> findAllAccounts(accountBusinessRule account) throws DataAccessException, IllegalArgumentException;
}
