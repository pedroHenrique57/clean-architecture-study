package Edu.Syne.application.usecases.conta.gateway;

import Edu.Syne.application.entities.Conta;

public interface ContaGateway {

  public void create(Conta conta);

  public void read(Conta conta);

  public void update(Conta conta);

  public void delete(Conta conta);
}
