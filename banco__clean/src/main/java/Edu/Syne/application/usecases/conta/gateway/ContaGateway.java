package Edu.Syne.application.usecases.conta.gateway;

import Edu.Syne.application.entities.conta;

public interface ContaGateway {

  public void create(conta conta);

  public void read(conta conta);

  public void update(conta conta);

  public void delete(conta conta);
}
