/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banana.proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mario
 */
public class Transaction {

    void insetarDatos() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sakila", "root", "root");
        Class.forName("com.mysql.jdbc.Driver").newInstance();

        try {

//Assume a valid connection object conn
            conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();
            String SQL = "INSERT INTO customer  values (605,1,'mario','arellano', 'mario@arellano.com',1,1,'2006-02-14 22:04:36', '2006-02-14 22:04:36')";
            stmt.executeUpdate(SQL);
//Submit a malformed SQL statement that breaks
            SQL = "INSERT INTO customer  values (606,1,'mario','arellano', 'mario@arellano.com',1,1,'2006-02-14 22:04:36', '2006-02-14 22:04:36')";
            stmt.executeUpdate(SQL);
// If there is no error.
            conn.commit();
        } catch (SQLException se) {
// If there is any error.
            conn.rollback();

        }
    }
}
