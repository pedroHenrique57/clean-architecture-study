package Edu.Syne.application.usecases.banco.gateway;

import Edu.Syne.application.entities.Bank;
import Edu.Syne.domain.entities.BancoRepositoryEntity;

import java.util.ArrayList;

public interface BancoGateway {

  public void createBank(BancoRepositoryEntity bank);

  public ArrayList<Bank> readBank();

  public void updateBank();

  public void deleteBank();

  public Bank findBankById(int id);

  public ArrayList<Bank> findAllBanks();
}
