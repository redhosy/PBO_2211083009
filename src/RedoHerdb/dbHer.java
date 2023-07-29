/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RedoHerdb;

import RedoHer.Dao.*;
import RedoHer.Model.*;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.logging.*;

/**
 *
 * @author septa
 */
public class dbHer {
    public static Connection connection;
    
    public static Connection getConnection() throws SQLException{
        if(connection ==null){
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost/redo_her");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }
        return connection;
    }
    public static void main(String[] args) {
        try {
            connection = dbHer.getConnection();
            WarnetDao dao = new WarnetDaoImpl(connection);
            Warnet w = new Warnet("T001","Ali","01-01-2015",10,12,2,3000,1000,5000);
            dao.insert(w);
            JOptionPane.showMessageDialog(null, "entry ok");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }       
    }
}
