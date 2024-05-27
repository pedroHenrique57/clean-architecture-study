package Edu.Syne.application.usecases.client.gateway;

import Edu.Syne.application.entities.clientBusinessRule;
import Edu.Syne.application.usecases.accounts.accountEnum.accountType;
import org.springframework.dao.DataAccessException;

import java.util.ArrayList;

public interface clientGateway {
  void createClient(clientBusinessRule client, accountType accountType) throws IllegalArgumentException, DataAccessException;

  void readClient(clientBusinessRule client);

  void updateClient(clientBusinessRule client);

  void deleteClient(clientBusinessRule client);

  clientBusinessRule findClientById(int id);

  ArrayList<clientBusinessRule> findAllClients();

}
