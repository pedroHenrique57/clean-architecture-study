package Edu.Syne.application.usecases.client.gateway;

import Edu.Syne.application.entities.clientBusinessRule;

import java.util.ArrayList;

public interface clientGateway {
  public void createClient(clientBusinessRule client);

  public void readClient(clientBusinessRule client);

  public void updateClient(clientBusinessRule client);

  public void deleteClient(clientBusinessRule client);

  public clientBusinessRule findClientById(int id);

  public ArrayList<clientBusinessRule> findAllClients();

}
