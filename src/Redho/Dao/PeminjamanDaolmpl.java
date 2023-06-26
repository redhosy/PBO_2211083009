/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Redho.Model.*;
import Redho.View.*;
import java.util.*;
import java.sql.SQLException;

/**
 *
 * @author septa
 */
public class PeminjamanDaolmpl implements PeminjamanDao{
    private Connection con;
    private Peminjaman p;
    private AnggotaDao Adao;
    private FormPeminjaman view;
    
    public PeminjamanDaolmpl(Connection con)throws Exception{
        this.con = con;
        Adao = new AnggotaDaolmpl(con);
        p = new Peminjaman();
    }
    
    @Override
    public void insert (Peminjaman p)throws SQLException{
        String sql = "insert into peminjaman values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, p.getKodeAnggota());
        ps.setString(2, p.getKodebuku());
        ps.setString(3, p.getTglpinjam());
        ps.setString(4, p.getTglkembali());
        ps.executeUpdate();
    }
    
    @Override
    public void update (Peminjaman p)throws SQLException{
        String sql = "Update peminjaman SET Tglkembali = ?"
                +"WHERE kodeAnggota = ? and Kodebuku = ? and Tglpinjam = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, p.getTglkembali());
        ps.setString(2, p.getKodeAnggota());
        ps.setString(3, p.getKodebuku());
        ps.setString(4, p.getTglpinjam());
        ps.executeUpdate();
        
    }
    @Override
    public void delete(Peminjaman p)throws SQLException{
        String sql = "DELETE FROM peminjaman WHERE kodeAnggota = ? and Kodebuku = ? and Tglpinjam = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, p.getKodeAnggota());
        ps.setString(2, p.getKodebuku());
        ps.setString(3, p.getTglpinjam());
        ps.executeUpdate();
    }
    
    public Peminjaman getPeminjaman(String kodeAnggota, String Kodebuku, String Tglkembali)throws SQLException, Exception {
        String sql = "select * from peminjaman where kodeAnggota= ? and Kodebuku= ? and Tglkembali= ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kodeAnggota);
        ps.setString(2, Kodebuku);
        ps.setString(3, Tglkembali);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            p = new Peminjaman();
            p.setKodeAnggota(rs.getString(1));
            p.setKodebuku(rs.getString(2));
            p.setTglpinjam(rs.getString(3));
            p.setTglkembali(rs.getString(4));
        }
        return p;
    }
    
    public List<Peminjaman> getAll()throws SQLException{
        String sql = "SELECT * FROM peminjaman";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Peminjaman> list = new ArrayList<>();
        while(rs.next()){
            p = new Peminjaman();
            p.setKodeAnggota(rs.getString(1));
            p.setKodebuku(rs.getString(2));
            p.setTglpinjam(rs.getString(3));
            p.setTglkembali(rs.getString(4));
            list.add(p);
        }
        return list;
    }
}
