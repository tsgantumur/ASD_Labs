package lab7.facade;

import java.sql.Connection;
import java.sql.PreparedStatement;

public interface IStatement {
	public PreparedStatement getStatement(Connection conn, String sql);
}
