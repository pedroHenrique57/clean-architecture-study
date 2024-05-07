package Edu.Syne.entities;

public interface ClienteInterface {

  public default void saqueConta() {}

  public default void depositoConta() {}

  public default void transferenciaConta() {}

  public default void consultarContas() {}
}
