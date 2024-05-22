package Edu.Syne.application.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class clientBusinessRule {

  public clientBusinessRule(String name, Integer id__checking__account, Integer id__savings__account) {
    this.name = name;
    this.id__checking__account = id__checking__account;
    this.id__savings__account = id__savings__account;
  }

  public clientBusinessRule(String name, Integer id__checking__account) {
    this.name = name;
    this.id__checking__account = id__checking__account;
  }

  String name;

  Integer id__checking__account;

  Integer id__savings__account;

}