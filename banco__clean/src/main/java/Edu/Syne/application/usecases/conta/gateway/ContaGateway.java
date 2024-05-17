package Edu.Syne.application.usecases.conta.gateway;

import Edu.Syne.application.entities.Client;

public interface ContaGateway {

  public void create(Client client);

  public void read(Client client);

  public void update(Client client);

  public void delete(Client client);
}
