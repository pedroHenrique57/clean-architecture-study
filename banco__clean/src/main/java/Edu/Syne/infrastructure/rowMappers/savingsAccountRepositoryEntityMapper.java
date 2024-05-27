package Edu.Syne.infrastructure.rowMappers;

import Edu.Syne.application.entities.accounts.savingsAccountBusinessRule;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class savingsAccountRepositoryEntityMapper implements RowMapper<savingsAccountBusinessRule> {

  @Override
  public savingsAccountBusinessRule mapRow(ResultSet rs, int rowNum) throws SQLException {
    savingsAccountBusinessRule account = new savingsAccountBusinessRule();
    account.setId__account(rs.getString("id__account"));
    account.setBalance(rs.getDouble("balance"));
    return null;
  }
}
