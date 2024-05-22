package Edu.Syne.controllers;

import Edu.Syne.application.entities.accounts.checkingAccountBusinessRule;
import Edu.Syne.application.usecases.conta.accountInteractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class checkingAccountController {

  private accountInteractor accountInteractor;

  @Autowired
  public checkingAccountController(accountInteractor accountInteractor) {
    this.accountInteractor = accountInteractor;
  }

  @GetMapping("/account/checking/create")
  public void hello() {
    checkingAccountBusinessRule accountEntity = new checkingAccountBusinessRule();
    this.accountInteractor.createAccount(accountEntity);
  }
}
