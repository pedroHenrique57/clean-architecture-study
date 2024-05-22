package Edu.Syne.application.usecases.conta.gateway;

import Edu.Syne.application.entities.clientBusinessRule;

public interface contaGateway {

  public void createAccount(clientBusinessRule client);

  public void read(clientBusinessRule client);

  public void update(clientBusinessRule client);

  public void delete(clientBusinessRule client);
}
