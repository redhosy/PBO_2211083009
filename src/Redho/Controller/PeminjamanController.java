/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho.Controller;

import java.sql.Connection;
import java.util.List;

import Redho.db.dbHelper;
import Redho.Dao.*;
import Redho.Model.*;
import Redho.View.FormPeminjaman;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author septa
 */
public class PeminjamanController {
   private FormPeminjaman view;
   private AnggotaDao Adao;
   private BukuDao Bdao;
   private PeminjamanDao dao;
   private Peminjaman pm; 
   private Connection con;
   
    public PeminjamanController(FormPeminjaman view)throws Exception{
            this.view = view;
            con = dbHelper.getConnection();
            dao = new PeminjamanDaolmpl(con);
            Adao = new AnggotaDaolmpl(con);
            Bdao = new BukuDaolmpl(con);
            pm = new Peminjaman();
    }
    
    public void bersih()throws Exception, SQLException{
       List<Buku> Blist = Bdao.getAll();
       List<Anggota> Alist = Adao.getAll();
       view.getTxtTglKembali().setText("yyyy-mm-dd");
       view.getTxtTglpinjam().setText("yyyy-mm-dd");
       view.getCboKodeAnggota().removeAllItems();
       view.getCboKodeBuku().removeAllItems();
       view.getCboKodeAnggota().addItem("");
       view.getCboKodeBuku().addItem("");
       
       for(Anggota a : Alist){
           view.getCboKodeAnggota().addItem(a.getKodeanggota()+"-"+a.getNamaanggota());
       }
       for(Buku b : Blist){
           view.getCboKodeBuku().addItem(b.getKodebuku()+"-"+b.getJudulbuku());
       }
    }
     
    
    public void insert(){
       try {
           String[] kodeAnggota = view.getCboKodeAnggota().getSelectedItem().toString().split("-");
           pm.setKodeAnggota(kodeAnggota[0]);
           String[] Kodebuku = view.getCboKodeBuku().getSelectedItem().toString().split("-");
           pm.setKodebuku(Kodebuku[0]);
           pm.setTglpinjam(view.getTxtTglpinjam().getText());
           pm.setTglkembali(view.getTxtTglpinjam().getText());
           dao.insert(pm);
           JOptionPane.showMessageDialog(view, "Berhasil dimasukkan");
       } catch (SQLException ex) {
           Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
       }
 } 

    
    public void update(){
        try {
            pm.setKodeAnggota(view.gettblpeminjaman().getValueAt(view.gettblpeminjaman().getSelectedRow(),0).toString());
            pm.setKodebuku(view.gettblpeminjaman().getValueAt(view.gettblpeminjaman().getSelectedRow(),1).toString());
            pm.setTglpinjam(view.getTxtTglpinjam().getText());
            pm.setTglkembali(view.getTxtTglKembali().getText());
            dao.update(pm);
            JOptionPane.showMessageDialog(view, "Update Anda Berhasil");
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(){
       try {
           String[] kodeAnggota = view.getCboKodeAnggota().getSelectedItem().toString().split("-");
           pm.setKodeAnggota(kodeAnggota[0]);
           String[] Kodebuku = view.getCboKodeBuku().getSelectedItem().toString().split("-");
           pm.setKodebuku(Kodebuku[0]);
           dao.delete(pm);
           JOptionPane.showMessageDialog(view, "Berhasil dihapuus");
       } catch (SQLException ex) {
           Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
       }
       
    }
    
    public void tableklik(){
        try {
            String Kodebuku = view.gettblpeminjaman().getValueAt(view.gettblpeminjaman().getSelectedRow(), 1).toString();
            String kodeAnggota = view.gettblpeminjaman().getValueAt(view.gettblpeminjaman().getSelectedRow(), 0).toString();
            String Tglpinjam = view.gettblpeminjaman().getValueAt(view.gettblpeminjaman().getSelectedRow(), 2).toString();
            pm = dao.getPeminjaman(kodeAnggota, Kodebuku, Tglpinjam);
            Anggota anggota = Adao.getAnggota(pm.getKodeAnggota());
            Buku buku = Bdao.getBuku(pm.getKodebuku());
            view.getTxtTglKembali().setText(pm.getTglkembali());
            view.getCboKodeAnggota().setSelectedItem(pm.getKodeAnggota()+"-"+anggota.getNamaanggota());
            view.getCboKodeBuku().setSelectedItem(pm.getKodebuku()+"-"+buku.getJudulbuku());
            view.getTxtTglpinjam().setText(pm.getTglpinjam());
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
    
    public void tampil(){
            DefaultTableModel tabelModel =
                    (DefaultTableModel) view.gettblpeminjaman().getModel();
            tabelModel.setRowCount(0);
        try {
            List<Peminjaman> list = dao.getAll();
            for(Peminjaman p : list){
                Object[] row = {
                    p.getKodeAnggota(),
                    p.getKodebuku(),
                    p.getTglpinjam(),
                    p.getTglkembali()
                };
                tabelModel.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
