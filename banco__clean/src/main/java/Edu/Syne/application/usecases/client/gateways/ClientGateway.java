package Edu.Syne.application.usecases.client.gateways;

import Edu.Syne.application.entities.Client;

public interface ClientGateway {
  public Client create(Client client);

  public Client read(Client client);

  public Client update(Client client);

  public Client delete(Client client);
}
