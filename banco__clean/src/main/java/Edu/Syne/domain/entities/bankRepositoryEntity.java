package Edu.Syne.domain.entities;

import Edu.Syne.application.entities.Client;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString


public class bankRepositoryEntity {

  private int id;

  private String name;

  private List<Client> clients__id__client;
}
