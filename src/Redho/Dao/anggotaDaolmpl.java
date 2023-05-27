/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho.Dao;

import Redho.Model.anggota;
import java.sql.*;

/**
 *
 * @author septa
 */
public class anggotaDaolmpl implements anggotaDao{
    private Connection connection;
    
    public anggotaDaolmpl(Connection connection){
        this.connection = connection;
    }
    
     public void insert (anggota Anggota) throws Exception{
     String sql = "insert into anggota value(?,?,?,?)";
     PreparedStatement ps = connection.prepareStatement(sql);
     ps.setString(1,Anggota.getKodeanggota());
     ps.setString(2,Anggota.getNamaanggota());
     ps.setString(3,Anggota.getAlamat());
     ps.setString(4,Anggota.getJeniskelamin());
     ps.executeUpdate();
     ps.close();  
     }   
}
