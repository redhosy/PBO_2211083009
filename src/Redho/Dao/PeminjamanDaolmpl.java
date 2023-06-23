/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho.Dao;
import Redho.Model.Peminjaman;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

/**
 *
 * @author septa
 */
public class PeminjamanDaolmpl implements PeminjamanDao{
    private Connection connection;
    private Peminjaman p;
    
    public PeminjamanDaolmpl(Connection connection){
        this.connection = connection;
        p = new Peminjaman();
    }
    
    public void pinjam (Peminjaman peminjaman)throws Exception{
        String sql = "insert into peminjaman values(?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getKodeAnggota());
        ps.setString(2, peminjaman.getKodebuku());
        ps.setString(3, peminjaman.getTglpinjam());
        ps.setString(4, peminjaman.getTglkembali());
        ps.setString(5, peminjaman.getKodepeminjaman());
        ps.executeUpdate();
        ps.close();
    }
    
    public void update (Peminjaman peminjaman)throws Exception{
        String sql = "Update peminjaman SET kodeAnggota = ?, Kodebuku = ?, Tglpinjam = ?, Tglkembali = ?"
                +"WHERE Kodepeminjaman = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getKodeAnggota());
        ps.setString(2, peminjaman.getKodebuku());
        ps.setString(3, peminjaman.getTglpinjam());
        ps.setString(3, peminjaman.getTglkembali());
        ps.setString(3, peminjaman.getKodepeminjaman());
        ps.executeUpdate();
        ps.close();
    }
    
    public void delete(Peminjaman peminjaman)throws Exception{
        String sql = "DELETE FROM peminjaman WHERE Kodepeminjaman = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getKodepeminjaman());
        ps.executeUpdate();
        ps.close();
    }
    
    public Peminjaman getPeminjaman(String Kodepeminjaman)throws Exception {
        String sql = "select * from peminjaman where Kodepeminjaman = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, Kodepeminjaman);
        ResultSet rs = ps.executeQuery();
        p= null;
        if(rs.next()){
            p = new Peminjaman();
            p.setKodeAnggota(rs.getString(1));
            p.setKodebuku(rs.getString(2));
            p.setTglpinjam(rs.getString(3));
            p.setTglkembali(rs.getString(4));
            p.setKodepeminjaman(rs.getString(5));
        }
        return p;
    }
    
    public List<Peminjaman> getAll()throws Exception{
        String sql = "SELECT * FROM peminjaman";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        List<Peminjaman> list = new ArrayList<>();
        while(rs.next()){
            Peminjaman peminjaman = new Peminjaman();
            peminjaman.setKodeAnggota(rs.getString(1));
            peminjaman.setKodebuku(rs.getString(2));
            peminjaman.setTglpinjam(rs.getString(3));
            peminjaman.setTglkembali(rs.getString(4));
            peminjaman.setKodepeminjaman(rs.getString(5));
            list.add(peminjaman);
        }
        return list;
    }
}
