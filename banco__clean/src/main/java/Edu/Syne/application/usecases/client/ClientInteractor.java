package Edu.Syne.application.usecases.client;

import Edu.Syne.application.entities.Client;
import Edu.Syne.application.usecases.client.gateways.ClientGateway;

public class ClientInteractor implements ClientInterface {
  private ClientGateway clientGateway;

  public ClientInteractor(ClientGateway clientGateway) {
    this.clientGateway = clientGateway;
  }

  @Override
  public Client create(Client client) {
    clientGateway.create(client);
    return null;
  }

  @Override
  public Client read(Client client) {
    clientGateway.read(client);
    return null;
  }

  @Override
  public Client update(Client client) {
    clientGateway.update(client);
    return null;
  }

  @Override
  public Client delete(Client client) {
    clientGateway.delete(client);
    return null;
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

  @Override
  public void consultarConta(Client client) {

  }
}
