/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RedoHer.Dao;
import RedoHer.Model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

/**
 *
 * @author septa
 */
public class WarnetDaoImpl implements WarnetDao{
  private Connection connection;
  private Warnet w;
  
 public WarnetDaoImpl(Connection connection){
       this.connection = connection;
 }
 
 public void insert(Warnet w)throws Exception{
        String sql = "insert into warnet values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,w.getKodetr());
        ps.setString(2,w.getNamapel());
        ps.setString(3,w.getTglmasuk());
        ps.setInt(4,w.getJammasuk());
        ps.setInt(5,w.getJamkeluar());
        ps.setInt(6,w.getLama());
        ps.setInt(7,w.getTarif());
        ps.setInt(8,w.getDiskon());
        ps.setDouble(9,w.getTotal());
        ps.executeUpdate();
        ps.close();  
    }
 
  public void update(Warnet w)throws Exception{
        String sql = "Update warnet SET namapel = ?, tglmasuk = ?, jammasuk = ?, jamkeluar = ?, lama = ?, tarif = ?, diskon = ?, total = ?"
                 + "WHERE kodetr = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,w.getNamapel());
        ps.setString(2,w.getTglmasuk());
        ps.setInt(3,w.getJammasuk());
        ps.setInt(4,w.getJamkeluar());
        ps.setInt(5,w.getLama());
        ps.setInt(6,w.getTarif());
        ps.setInt(7,w.getDiskon());
        ps.setDouble(8,w.getTotal());
        ps.setString(9,w.getKodetr());
        ps.executeUpdate();
        ps.close(); 
    }
  
  public void delete(Warnet w) throws Exception{
         String sql = "DELETE FROM warnet WHERE kodetr = ?";
         PreparedStatement ps = connection.prepareStatement(sql);
         ps.setString(1, w.getKodetr());
         ps.executeUpdate();
         ps.close();
     }
  
  public Warnet getWarnet(String kodetr) throws Exception {
         String sql = "select * FROM warnet WHERE kodetr = ?";
         PreparedStatement ps = connection.prepareStatement(sql);
         ps.setString(1, kodetr);
         ResultSet rs = ps.executeQuery();
         Warnet w = null;
         if(rs.next()){
             w = new Warnet();
             w.setKodetr(rs.getString(1));
             w.setNamapel(rs.getString(2));
             w.setTglmasuk(rs.getString(3));
             w.setJammasuk(rs.getInt(4));
             w.setJamkeluar(rs.getInt(5));
             w.setLama(rs.getInt(6));
             w.setTarif(rs.getInt(7));
             w.setDiskon(rs.getInt(8));
             w.setTotal( rs.getDouble(9));
         }
         return w;
     }
    
   public List<Warnet> getAll()throws Exception{
     String sql =  "SELECT * FROM warnet"; 
     PreparedStatement ps = connection.prepareStatement(sql);
     ResultSet rs = ps.executeQuery();
     
       List<Warnet> list = new ArrayList<>();
         while(rs.next()){
             Warnet w = new Warnet();
             w.setKodetr(rs.getString(1));
             w.setNamapel(rs.getString(2));
             w.setTglmasuk(rs.getString(3));
             w.setJammasuk(rs.getInt(4));
             w.setJamkeluar(rs.getInt(5));
             w.setLama(rs.getInt(6));
             w.setTarif(rs.getInt(7));
             w.setDiskon(rs.getInt(8));
             w.setTotal( rs.getDouble(9));
             list.add(w);
         }
         return list;
     }

}


