package Edu.Syne.application.usecases.conta;

import Edu.Syne.application.entities.clientBusinessRule;

public interface ContaInterface {

  public void saqueConta(clientBusinessRule client);

  public void depositoConta(clientBusinessRule client);

  public void transferenciaConta(clientBusinessRule clientSender, clientBusinessRule clientRecipient);

  public void consultarContas(clientBusinessRule client);
}
