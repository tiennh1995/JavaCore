/**
 * 
 */
package jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

/**
 * @author Nguyen Huu Tien
 */
public class TestJDBC {
  static Connection conn = null;
  static Statement stm = null;
  static String sql = null;

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    conn = Connect.getMySQLConnection();
    stm = (Statement) conn.createStatement();

//    sql = "CREATE TABLE pricelist(id int primary key auto_increment, name varchar(20), price float);";
//    try {
//      stm.execute(sql);
//    } catch (Exception e) {
//      e.printStackTrace();
//      System.out.println("Cannot create table!");
//    }
    
    // Test with statement
//    insertData("NHT", 10);
//    updateData("NHT", 20);
//    deleteData("NHT");
//    ResultSet rs = getAllData();
//    while(rs.next()) {
//      System.out.println(rs.getString("name") + " " + rs.getDouble("price"));
//    }
//    
//     Test with prepareStatement
//    insertDataP("LTHH", 20);
//    updateDataP("LTHH", 30);
    deleteDataP("LTHH");
  }
  
  // Test statement
  public static boolean insertData(String name, float price) {
    String sql = "INSERT INTO pricelist VALUES('" + name + "', " + price + ");";
    if (conn != null) {
      try {
        stm.executeUpdate(sql);
      } catch (SQLException e) {
        e.printStackTrace();
        return false;
      }
    }
    return true;
  }
  
  public static boolean updateData(String name, float price) {
    String sql = "UPDATE pricelist SET price = " + price + " WHERE name = '" + name + "';";
    if (conn != null) {
      try {
        stm.executeUpdate(sql);
      } catch (SQLException e) {
        e.printStackTrace();
        return false;
      }
    }
    return true;    
  }
  
  public static boolean deleteData(String name) {
    String sql = "DELETE FROM pricelist WHERE name = '" + name + "';";
    if (conn != null) {
      try {
        stm.executeUpdate(sql);
      } catch (SQLException e) {
        e.printStackTrace();
        return false;
      }
    }
    return true;     
  }
  
  public static ResultSet getAllData() {
    String sql = "SELECT * FROM pricelist;";
    ResultSet rs = null;
    if (conn != null) {
      try {
        rs = (ResultSet) stm.executeQuery(sql);
      } catch (SQLException e) {
        e.printStackTrace();
        return null;
      }
    }
    return rs;    
  }
  
  // Test pepareStatement
  public static boolean insertDataP(String name, float price) {
    String sql = "INSERT INTO pricelist(name, price) VALUES(?, ?);";
    if (conn != null) {
      try {
        PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
        ps.setString(1, name);
        ps.setDouble(2, price);
        ps.executeUpdate();
      } catch (SQLException e) {
        e.printStackTrace();
        return false;
      }
    }
    return true;       
  }
  
  public static boolean updateDataP(String name, float price) {
    String sql = "UPDATE pricelist SET price = ? WHERE name = ?;";
    if (conn != null) {
      try {
        PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
        ps.setDouble(1, price);
        ps.setString(2, name);
        ps.executeUpdate();
      } catch (SQLException e) {
        e.printStackTrace();
        return false;
      }
    }
    return true;          
  }
  
  public static boolean deleteDataP(String name) {
    String sql = "DELETE FROM pricelist WHERE name = ?;";
    if (conn != null) {
      try {
        PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
        ps.setString(1, name);
        ps.executeUpdate();
      } catch (SQLException e) {
        e.printStackTrace();
        return false;
      }
    }
    return true;      
  }
}
