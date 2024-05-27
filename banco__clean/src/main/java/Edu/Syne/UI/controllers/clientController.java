package Edu.Syne.UI.controllers;

import Edu.Syne.application.entities.clientBusinessRule;
import Edu.Syne.application.usecases.accounts.accountEnum.accountType;
import Edu.Syne.application.usecases.client.clientInteractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class clientController {

  clientInteractor clientInteractor;

  @Autowired
  public clientController(clientInteractor clientInteractor) {
    this.clientInteractor = clientInteractor;
  }

  @PostMapping("/client/create{accountTypeParam}")
  public ResponseEntity createClient(@RequestBody clientBusinessRule clientFromBody, @RequestParam(value = "accountTypeParam", required = true) String accountTypeParam) throws IllegalArgumentException, DataAccessException {
    // Create the Business entity and set values
    clientBusinessRule clientBusinessRule = new clientBusinessRule();
    clientBusinessRule.setName(clientFromBody.getName());
    try {
      // Verify the parameter to define the account type
      if (accountTypeParam.equals("checking")) {
        clientInteractor.createClient(clientBusinessRule, accountType.checking);
      } else if (accountTypeParam.equals("savings")) {
        clientInteractor.createClient(clientBusinessRule, accountType.savings);
      } else {
        return ResponseEntity.badRequest().body("Invalid account type");
      }
      return ResponseEntity.ok().body("Sucessfully created the account type: " + accountTypeParam);
    } catch (Exception e) {
      return ResponseEntity.badRequest().body("Error creating the account. Error message: " + e.getMessage());
    }
  }
}
