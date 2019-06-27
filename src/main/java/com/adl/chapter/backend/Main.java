package com.adl.chapter.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
  public static void main(String []args) throws ClassNotFoundException, SQLException {
    Class.forName("org.h2.Driver");
    Connection conn = DriverManager.getConnection ("jdbc:h2:~/test", "sa","");
    Statement st = conn.createStatement();
    st.execute("CREATE TABLE USER(id int, name varchar)");
    conn.close();
  }

}
