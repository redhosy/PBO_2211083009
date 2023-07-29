/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho.Dao;
import Redho.Model.*;
import java.util.*;
import java.sql.*;
/**
 *
 * @author septa
 */
public class MahasiswaDaoImpl implements MahasiswaDao{
    private Connection connection;
    private Mahasiswa m;
    
    public MahasiswaDaoImpl(Connection connection){
        this.connection = connection;
    }


    
    public void insert(Mahasiswa m)throws Exception{
        String sql = "insert into mahasiswa values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,m.getNim());
        ps.setString(2,m.getNama());
        ps.setInt(3,m.getUsia());
        ps.setDouble(4,m.getHitungukt());
        ps.executeUpdate();
        ps.close();  
    }
    
    public void update(Mahasiswa m)throws Exception{
        String sql = "Update mahasiswa SET nama = ?, usia = ?, hitungukt = ?"
                 + "WHERE nim = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,m.getNama());
        ps.setInt(2,m.getUsia());
        ps.setDouble(3,m.getHitungukt());
        ps.setString(4,m.getNim());
        ps.executeUpdate();
        ps.close();  
    }
    
    public void delete(Mahasiswa m) throws Exception{
         String sql = "DELETE FROM mahasiswa WHERE nim = ?";
         PreparedStatement ps = connection.prepareStatement(sql);
         ps.setString(1, m.getNim());
         ps.executeUpdate();
         ps.close();
     }
    
     public Mahasiswa getMahasiswa(String nim) throws Exception {
         String sql = "select * FROM mahasiswa WHERE nim = ?";
         PreparedStatement ps = connection.prepareStatement(sql);
         ps.setString(1, nim);
         ResultSet rs = ps.executeQuery();
         Mahasiswa m = null;
         if(rs.next()){
             m = new Mahasiswa();
             m.setNim(rs.getString(1));
             m.setNama(rs.getString(2));
             m.setUsia(rs.getInt(3));
             m.setHitungukt((int) rs.getDouble(4));
         }
         return m;
     }
     
     public List<Mahasiswa> getAll()throws Exception{
     String sql =  "SELECT * FROM mahasiswa"; 
     PreparedStatement ps = connection.prepareStatement(sql);
     ResultSet rs = ps.executeQuery();
     
       List<Mahasiswa> list = new ArrayList<>();
         while(rs.next()){
             Mahasiswa m = new Mahasiswa();
             m.setNim(rs.getString(1));
             m.setNama(rs.getString(2));
             m.setUsia(rs.getInt(3));
             m.setHitungukt((int) rs.getDouble(4));
             list.add(m);
         }
         return list;
     }
}
