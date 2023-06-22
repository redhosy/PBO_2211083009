/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho.Dao;
import Redho.Model.Buku;
import java.sql.*;
import java.util.*;

/**
 *
 * @author septa
 */
public class BukuDaolmpl implements BukuDao{
    private Connection connection;
    
    public BukuDaolmpl(Connection connection){
        this.connection = connection;
    }
    

    public void insert(Buku buku)throws Exception{
        String sql = "insert into buku values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,buku.getKodebuku());
        ps.setString(2,buku.getJudulbuku());
        ps.setString(3,buku.getPengarang());
        ps.setString(4,buku.getPenerbit());
        ps.executeUpdate();
        ps.close();  
    }
    
  
    public void update(Buku buku)throws Exception{
         String sql = "Update buku SET Judulbuku = ?, Pengarang = ?, Penerbit = ?"
                 + "WHERE Kodebuku = ?";
         PreparedStatement ps = connection.prepareStatement(sql);
         ps.setString(1, buku.getJudulbuku());
         ps.setString(2, buku.getPengarang());
         ps.setString(3, buku.getPenerbit());
         ps.setString(4, buku.getKodebuku());
         ps.executeUpdate();
         ps.close();
     }
 
     public void delete(Buku buku) throws Exception{
         String sql = "DELETE FROM buku WHERE Kodebuku = ?";
         PreparedStatement ps = connection.prepareStatement(sql);
         ps.setString(1, buku.getKodebuku());
         ps.executeUpdate();
         ps.close();
     }
     
     public Buku getBuku(String Kodebuku) throws Exception {
         String sql = "select * FROM buku WHERE Kodebuku = ?";
         PreparedStatement ps = connection.prepareStatement(sql);
         ps.setString(1, Kodebuku);
         ResultSet rs = ps.executeQuery();
         Buku buku = null;
         if(rs.next()){
             buku = new Buku();
             buku.setKodebuku(rs.getString(1));
             buku.setJudulbuku(rs.getString(2));
             buku.setPengarang(rs.getString(3));
             buku.setPenerbit(rs.getString(4));
         }
         return buku;
     }
     
     
     public List<Buku> getAll()throws Exception{
     String sql =  "SELECT Kodebuku, Judulbuku, Pengarang, Penerbit FROM buku"; 
     PreparedStatement ps = connection.prepareStatement(sql);
     ResultSet rs = ps.executeQuery();
     
       List<Buku> list = new ArrayList<>();
         while(rs.next()){
             Buku buku = new Buku();
             buku.setKodebuku(rs.getString(1));
             buku.setJudulbuku(rs.getString(2));
             buku.setPengarang(rs.getString(3));
             buku.setPenerbit(rs.getString(4));
             list.add(buku);
         }
         return list;
     } 
}
