package Edu.Syne.controllers;

import Edu.Syne.application.entities.bankBusinessRule;
import Edu.Syne.application.usecases.banco.bankInteractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bankController {

  private bankInteractor bancoInteractor;

  @Autowired
  public bankController(bankInteractor bancoInteractor) {
    this.bancoInteractor = bancoInteractor;
  }

  @GetMapping("/bank")
  public void hello(@RequestParam(value = "name") String name) {
    bankBusinessRule entity = new bankBusinessRule(name);
    this.bancoInteractor.createBank(entity);
  }
}
