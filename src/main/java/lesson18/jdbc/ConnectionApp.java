package lesson18.jdbc;

import java.sql.Connection;

public class ConnectionApp {
  public static void main(String[] args) {
    Connection conn = DbConnection.getConnection();
  }
}
