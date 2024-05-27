package Edu.Syne.application.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class clientBusinessRule {
  String id__client;

  String name;

  String id__checking__account;

  String id__savings__account;
}