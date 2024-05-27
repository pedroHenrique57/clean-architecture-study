package Edu.Syne.UI.controllers;

import Edu.Syne.application.entities.clientBusinessRule;
import Edu.Syne.application.usecases.client.clientInteractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class clientController {

  clientInteractor clientInteractor;

  @Autowired
  public clientController(clientInteractor clientInteractor) {
    this.clientInteractor = clientInteractor;
  }

  @GetMapping("/client")
  public void hello(@RequestParam(value = "name") String name, @RequestParam(value = "id") int id, @RequestParam(required = false, value = "id2") Integer id2) {
    if (id2 != null) {
      clientBusinessRule client = new clientBusinessRule(name, id, id2);
      this.clientInteractor.createClient(client);
    } else {
      clientBusinessRule client = new clientBusinessRule(name, id);
      this.clientInteractor.createClient(client);
    }
  }
}
