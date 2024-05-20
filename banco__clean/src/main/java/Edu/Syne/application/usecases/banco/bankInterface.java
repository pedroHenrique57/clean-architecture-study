package Edu.Syne.application.usecases.banco;

import Edu.Syne.application.entities.bankBusinessRule;

import java.util.ArrayList;

public interface bankInterface {

  public void createBank(bankBusinessRule bankEntity);

  public ArrayList<bankBusinessRule> readBank();

  public void updateBank();

  public void deleteBank();

  public bankBusinessRule findBankById(int id);

  public ArrayList<bankBusinessRule> findAllBanks();
}