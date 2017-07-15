/**
 * 
 */
package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

/**
 * @author Nguyen Huu Tien
 */
public class Connect {
  public static Connection getMySQLConnection() throws SQLException, ClassNotFoundException {
    String hostName = "localhost:3306";
    String dbName = "javacore";
    String userName = "root";
    String password = "123456";

    return getMySQLConnection(hostName, dbName, userName, password);
  }

  public static Connection getMySQLConnection(String hostName, String dbName, String userName, String password)
      throws SQLException, ClassNotFoundException {
    Class.forName("com.mysql.jdbc.Driver");
    String connectionURL = "jdbc:mysql://" + hostName + "/" + dbName;
    Connection conn = (Connection) DriverManager.getConnection(connectionURL, userName, password);
    return conn;
  }
}
