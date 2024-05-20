package Edu.Syne.application.usecases.banco.gateway;

import Edu.Syne.application.entities.bankBusinessRule;

import java.util.ArrayList;

public interface bankGateway {

  public void createBank(bankBusinessRule bank);

  public ArrayList<bankBusinessRule> readBank();

  public void updateBank();

  public void deleteBank();

  public bankBusinessRule findBankById(int id);

  public ArrayList<bankBusinessRule> findAllBanks();
}
