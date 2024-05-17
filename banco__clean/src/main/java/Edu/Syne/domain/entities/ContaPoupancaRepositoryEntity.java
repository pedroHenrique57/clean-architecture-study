package Edu.Syne.domain.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Lombok annotations
@Getter
@Setter
@ToString

// JDBC annotations
@Component
@Scope("prototype")
public class ContaPoupancaRepositoryEntity {
  private int idconta;

  private int saldo;
}
