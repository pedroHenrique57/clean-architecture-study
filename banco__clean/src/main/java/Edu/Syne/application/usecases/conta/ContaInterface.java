package Edu.Syne.application.usecases.conta;

import Edu.Syne.application.entities.Client;

public interface ContaInterface {

  public void saqueConta(Client client);

  public void depositoConta(Client client);

  public void transferenciaConta(Client clientSender, Client clientRecipient);

  public void consultarContas(Client client);
}
