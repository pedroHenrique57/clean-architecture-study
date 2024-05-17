package Edu.Syne.application.usecases.banco;

import Edu.Syne.application.entities.Bank;
import Edu.Syne.application.usecases.banco.gateway.BancoGateway;
import Edu.Syne.domain.entities.BancoRepositoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class BancoInteractor implements BancoInterface {

  private final BancoGateway BancoRepo;

  @Autowired
  public BancoInteractor(BancoGateway BancoRepo) {
    this.BancoRepo = BancoRepo;
  }

  @Override
  public void createBank(BancoRepositoryEntity bankEntity) {
    this.BancoRepo.createBank(bankEntity);
  }

  @Override
  public ArrayList<Bank> readBank() {
    return null;
  }

  @Override
  public void updateBank() {

  }

  @Override
  public void deleteBank() {

  }

  @Override
  public Bank findBankById(int id) {
    return null;
  }

  @Override
  public ArrayList<Bank> findAllBanks() {
    return null;
  }
}
