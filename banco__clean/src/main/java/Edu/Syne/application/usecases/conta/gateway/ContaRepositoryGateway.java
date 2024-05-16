package Edu.Syne.application.usecases.conta.gateway;

import Edu.Syne.application.entities.Conta;
import Edu.Syne.external.DB.repository.persistence.ContaCorrente.ContaCorrenteRepository;

public class ContaRepositoryGateway implements ContaGateway {
  private final ContaCorrenteRepository repository;

  public ContaRepositoryGateway(ContaCorrenteRepository repository) {
    this.repository = repository;
  }

  @Override
  public void create(Conta conta) {
  }

  @Override
  public void read(Conta conta) {

  }

  @Override
  public void update(Conta conta) {

  }

  @Override
  public void delete(Conta conta) {

  }
}
