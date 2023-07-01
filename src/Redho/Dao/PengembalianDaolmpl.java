/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho.Dao;

import Redho.View.FormPengembalian;
import java.sql.Connection;
import Redho.Model.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author septa
 */
public class PengembalianDaolmpl implements PengembalianDao{
    private Connection con;
    private Pengembalian p;
    private AnggotaDao Adao;
    private FormPengembalian view;
    
    public PengembalianDaolmpl(Connection con)throws Exception{
        this.con = con;
        Adao = new AnggotaDaolmpl(con);
        p = new Pengembalian();
    }
    
    @Override
    public void insert (Pengembalian p) throws Exception{
        String sql = "insert into pengembalian values(?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, p.getKodeAnggota());
        ps.setString(2, p.getKodebuku());
        ps.setString(3, p.getTglpinjam());
        ps.setString(4, p.getTglkembali());
        ps.setInt(5, p.getTerlambat());
        ps.setDouble(6, p.getDenda());
        ps.executeUpdate();
    }
    
    @Override
    public void update (Pengembalian p) throws Exception{
        String sql = "Update pengembalian SET Tglkembali = ?"
                +"WHERE kodeAnggota = ? and Kodebuku = ? and Tglpinjam = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, p.getTglkembali());
        ps.setString(2, p.getKodeAnggota());
        ps.setString(3, p.getKodebuku());
        ps.setString(4, p.getTglpinjam());
        ps.setInt(5, p.getTerlambat());
        ps.setDouble(6, p.getDenda());
        ps.executeUpdate();
    }
    
     @Override
    public void delete(Pengembalian p)throws SQLException{
        String sql = "DELETE FROM pengembalian WHERE kodeAnggota = ? and Kodebuku = ? and Tglpinjam = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, p.getKodeAnggota());
        ps.setString(2, p.getKodebuku());
        ps.setString(3, p.getTglpinjam());
        ps.executeUpdate();
    }
    
    public int selisihtgl(String tgl1, String tgl2) throws Exception{
        int selisih = 0;
        String sql = "select datediff(?,?)as selisih";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,tgl1);
        ps.setString(2,tgl2);
        ResultSet rs = ps.executeQuery();
           if(rs.next()){
            selisih = rs.getInt(selisih);
        }
        return selisih;
    }
    
    public Pengembalian getPengembalian (String kodeAnggota, String Kodebuku, String Tglkembali)throws SQLException, Exception {
        String sql = "select * from peminjaman where kodeAnggota= ? and Kodebuku= ? and Tglkembali= ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kodeAnggota);
        ps.setString(2, Kodebuku);
        ps.setString(3, Tglkembali);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            p = new Pengembalian();
            p.setKodeAnggota(rs.getString(1));
            p.setKodebuku(rs.getString(2));
            p.setTglpinjam(rs.getString(3));
            p.setTglkembali(rs.getString(4));
        }
        return p;
    }
    
    public List<Pengembalian> getAll()throws SQLException{
        String sql = "SELECT * FROM pengembalian";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Pengembalian> list = new ArrayList<>();
        while(rs.next()){
            p = new Pengembalian();
            p.setKodeAnggota(rs.getString(1));
            p.setKodebuku(rs.getString(2));
            p.setTglpinjam(rs.getString(3));
            p.setTglkembali(rs.getString(4));
            list.add(p);
        }
        return list;
    }
}
