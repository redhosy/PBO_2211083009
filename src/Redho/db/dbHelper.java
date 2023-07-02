/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho.db;

import Redho.Model.Anggota;
import Redho.Dao.AnggotaDaolmpl;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Redho.Dao.AnggotaDao;
import java.util.logging.*;

/**
 *
 * @author septa
 */
public class dbHelper {
    private static Connection connection;

    public static Connection getConnection() throws SQLException{
        if(connection ==null){
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost/PBO_2211083009");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }
        return connection;
    }
    public static void main(String[] args) {
        try {
            connection = dbHelper.getConnection();
            AnggotaDao dao = new AnggotaDaolmpl(connection);
            Anggota Anggota = new Anggota("A001","Ali","Padang","L");
            dao.insert(Anggota);
            JOptionPane.showMessageDialog(null, "entry ok");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }       
    }
}
