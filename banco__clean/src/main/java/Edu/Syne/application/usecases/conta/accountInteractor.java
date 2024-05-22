package Edu.Syne.application.usecases.conta;

import Edu.Syne.application.entities.clientBusinessRule;
import Edu.Syne.application.usecases.conta.gateway.accountGateway;

public class ContaInteractor implements ContaInterface {
  public accountGateway contaGateway;

  public ContaInteractor(accountGateway contaGateway) {
    this.contaGateway = contaGateway;
  }

  @Override
  public void saqueConta(clientBusinessRule client) {

  }

  @Override
  public void depositoConta(clientBusinessRule client) {

  }

  @Override
  public void transferenciaConta(clientBusinessRule clientSender, clientBusinessRule clientRecipient) {

  }

  @Override
  public void consultarContas(clientBusinessRule client) {

  }
}