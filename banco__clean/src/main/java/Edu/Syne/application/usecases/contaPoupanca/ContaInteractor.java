package Edu.Syne.application.usecases.contaPoupanca;

import Edu.Syne.application.entities.Client;
import Edu.Syne.application.usecases.contaPoupanca.gateway.ContaGateway;

public class ContaInteractor implements ContaInterface{
  public ContaGateway contaGateway;

  public ContaInteractor(ContaGateway contaGateway) {
    this.contaGateway = contaGateway;
  }

  @Override
  public void saqueConta(Client client) {

  }

  @Override
  public void depositoConta(Client client) {

  }

  @Override
  public void transferenciaConta(Client clientSender, Client clientRecipient) {

  }

  @Override
  public void consultarContas(Client client) {

  }
}