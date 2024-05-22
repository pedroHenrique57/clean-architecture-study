package Edu.Syne.application.usecases.client;

import Edu.Syne.application.entities.Client;
import Edu.Syne.application.usecases.client.gateway.ClientGateway;
import Edu.Syne.application.usecases.conta.ContaInteractor;

public class ClientInteractor implements ClientInterface {
  private ClientGateway clientGateway;
  private ContaInteractor contaInteractor;

  public ClientInteractor(ClientGateway clientGateway, ContaInteractor contaInteractor) {
    this.clientGateway = clientGateway;
    this.contaInteractor = contaInteractor;
  }

  @Override
  public void saqueConta(Client client) {
    contaInteractor.saqueConta(client);
  }

  @Override
  public void depositoConta(Client client) {
    contaInteractor.depositoConta(client);
  }

  @Override
  public void transferenciaConta(Client clientSender, Client clientRecipient) {
    contaInteractor.transferenciaConta(clientSender, clientRecipient);
  }

  @Override
  public void consultarContas(Client client) {
    contaInteractor.consultarContas(client);
  }
}
