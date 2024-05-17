package Edu.Syne.controllers;

import Edu.Syne.application.usecases.banco.BancoInteractor;
import Edu.Syne.domain.entities.BancoRepositoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

  private BancoInteractor bancoInteractor;

  @Autowired
  public BankController(BancoInteractor bancoInteractor) {
    this.bancoInteractor = bancoInteractor;
  }

  @GetMapping("/hello")
  public void hello(@RequestParam(value = "name") String name) {
    BancoRepositoryEntity entity = new BancoRepositoryEntity();
    entity.setNome(name);
    System.out.println(entity);
    this.bancoInteractor.createBank(entity);
  }
}
