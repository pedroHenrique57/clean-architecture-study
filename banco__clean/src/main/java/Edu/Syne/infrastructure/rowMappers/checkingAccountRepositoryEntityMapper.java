package Edu.Syne.infrastructure.rowMappers;

import Edu.Syne.domain.entities.savingsAccountRepositoryEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class checkingAccountRepositoryEntityMapper implements RowMapper<savingsAccountRepositoryEntity> {

  @Override
  public savingsAccountRepositoryEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
    savingsAccountRepositoryEntity account = new savingsAccountRepositoryEntity();
    account.setId__savings__account(rs.getString("id__checking__account"));
    account.setBalance(rs.getDouble("balance"));
    return account;
  }
}
