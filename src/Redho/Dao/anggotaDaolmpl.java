/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho.Dao;
import Redho.Model.Anggota;
import java.sql.*;
import java.util.*;


/**
 *
 * @author septa
 */  
public class AnggotaDaolmpl implements AnggotaDao{
    private Connection connection;

    public AnggotaDaolmpl(Connection connection){
        this.connection = connection;
    }
    
     public void insert (Anggota Anggota) throws Exception{
        String sql = "insert into anggota values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,Anggota.getKodeanggota());
        ps.setString(2,Anggota.getNamaanggota());
        ps.setString(3,Anggota.getAlamat());
        ps.setString(4,Anggota.getJeniskelamin());
        ps.executeUpdate();
        ps.close();  
     }   
     
     public void update(Anggota anggota)throws Exception{
         String sql = "Update anggota SET namaAnggota = ?, alamat = ?, jenisKelamin = ?"
                 + "WHERE kodeAnggota = ?";
         PreparedStatement ps = connection.prepareStatement(sql);
         ps.setString(1, anggota.getNamaanggota());
         ps.setString(2, anggota.getAlamat());
         ps.setString(3, anggota.getJeniskelamin());
         ps.setString(4, anggota.getKodeanggota());
         ps.executeUpdate();
         ps.close();
     }
     
     
     public void delete(Anggota anggota) throws Exception{
         String sql = "DELETE FROM anggota WHERE kodeAnggota = ?";
         PreparedStatement ps = connection.prepareStatement(sql);
         ps.setString(1, anggota.getKodeanggota());
         ps.executeUpdate();
     }
     
     public Anggota getAnggota(String kodeanggota) throws Exception {
         String sql = "select * FROM anggota WHERE kodeAnggota =?";
         PreparedStatement ps = connection.prepareStatement(sql);
         ps.setString(1, kodeanggota);
         ResultSet rs = ps.executeQuery();
         Anggota Anggota = null;
         if(rs.next()){
             Anggota = new Anggota();
             Anggota.setKodeanggota(rs.getString(1));
             Anggota.setNamaanggota(rs.getString(2));
             Anggota.setAlamat(rs.getString(3));
             Anggota.setJeniskelamin(rs.getString(4));
         }
         return Anggota;
     }
     
     public List<Anggota> getAll()throws Exception{
     String sql =  "SELECT kodeanggota, namaanggota, alamat, jeniskelamin FROM anggota"; 
     PreparedStatement ps = connection.prepareStatement(sql);
     ResultSet rs = ps.executeQuery();
     
       List<Anggota> list = new ArrayList<>();
         while(rs.next()){
             Anggota anggota = new Anggota();
             anggota.setKodeanggota(rs.getString(1));
             anggota.setNamaanggota(rs.getString(2));
             anggota.setAlamat(rs.getString(3));
             anggota.setJeniskelamin(rs.getString(4));
             list.add(anggota);
         }
         return list;
     } 
}

