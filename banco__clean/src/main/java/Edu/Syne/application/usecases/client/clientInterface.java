package Edu.Syne.application.usecases.client;

import Edu.Syne.application.entities.Client;

public interface ClientInterface {

  // Other things

  public void saqueConta(Client client);

  public void depositoConta(Client client);

  public void transferenciaConta(Client clientSender, Client clientRecipient);

  public void consultarContas(Client client);
}
