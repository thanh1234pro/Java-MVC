/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connecttosqlserver;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class ConnectToSQLServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var server = "LAPTOP-MAPRODR3\\SQLEXPRESS";
        var user = "sa";
        var password = "1";
        var db = "QLSP";
        var post = 1433;
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setDatabaseName(db);
        ds.setServerName(server);
        ds.setPortNumber(post);
        try(Connection conn = ds.getConnection()){
            System.out.println("Kết nối SQL Server thành công !");
            System.out.println(conn.getCatalog());
    }   catch (SQLException ex) {    
          ex.printStackTrace();
        }    
    }
}
