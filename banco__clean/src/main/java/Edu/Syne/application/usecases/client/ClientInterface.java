package Edu.Syne.application.usecases.client;

import Edu.Syne.application.entities.Client;

public interface ClientInterface {

  // CRUD Client

  public Client create(Client client);

  public Client read(Client client);

  public Client update(Client client);

  public Client delete(Client client);

  // Other things

  public void saqueConta(Client client);

  public void depositoConta(Client client);

  public void transferenciaConta(Client clientSender, Client clientRecipient);

  public void consultarContas(Client client);

  public void consultarConta(Client client);
}
