/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho.Controller;

import Redho.Dao.*;
import Redho.Model.*;
import Redho.db.dbHelper;
import Redho.View.FormPeminjaman;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author septa
 */
public class PeminjamanController {
    FormPeminjaman view;
    PeminjamanDao dao;
    AnggotaDao Adao;
    BukuDao Bdao;
    Peminjaman pm = new Peminjaman();
    Connection con;
    Buku b = new Buku();
    
    public PeminjamanController(FormPeminjaman view){
        try {
            this.view = view;
            con = dbHelper.getConnection();
            dao = new PeminjamanDaolmpl(con);
            Adao = new AnggotaDaolmpl(con);
            Bdao = new BukuDaolmpl(con);
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void bersih(){
        try {
            List<Anggota> Alist = Adao.getAll();
            List<Buku> Blist = Bdao.getAll();
            view.getTxtKodePeminjaman().setText("");
            view.getTxtTglpinjam().setText("");
            view.getTxtTglKembali().setText("");
        
            view.getCboKodeAnggota().removeAllItems();
            view.getCboKodeBuku().removeAllItems();
            for(Anggota a : Alist){
                view.getCboKodeAnggota().addItem(a.getKodeanggota());
            }
            
            for(Buku b : Blist){
                view.getCboKodeBuku().addItem(b.getKodebuku()); 
            }
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void pinjam(){
        try {
            pm = new Peminjaman();
            LocalDate tanggalSaatIni = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String tanggalFormatted = tanggalSaatIni.format(formatter);
            pm.setKodepeminjaman(view.getTxtKodePeminjaman().getText());
            pm.setKodeAnggota(view.getCboKodeAnggota().getSelectedItem().toString());
            pm.setKodebuku(view.getCboKodeBuku().getSelectedItem().toString());
            pm.setTglpinjam(view.getTxtTglpinjam().getText());
            pm.setTglkembali(tanggalFormatted);
            System.out.println(tanggalFormatted);
            dao.pinjam(pm);
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(){
        try {
            pm = new Peminjaman();
            pm.setKodepeminjaman(view.getTxtKodePeminjaman().getText());
            pm.setKodeAnggota(view.getCboKodeAnggota().getSelectedItem().toString());
            pm.setKodebuku(view.getCboKodeBuku().getSelectedItem().toString());
            pm.setTglpinjam(view.getTxtTglpinjam().getText());
            pm.setTglkembali(view.getTxtTglKembali().getText());
            dao.update(pm);
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(){
        try {
            dao.delete(pm);
            JOptionPane.showMessageDialog(view, "delete okey");
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tableklik(){
        try {
            String Kodepeminjaman = view.gettblpeminjaman().getValueAt(view.gettblpeminjaman().getSelectedRow(), 0).toString();
            pm = dao.getPeminjaman(Kodepeminjaman);
            view.getTxtKodePeminjaman().setText(pm.getKodepeminjaman());
            view.getCboKodeAnggota().setSelectedItem(pm.getKodeAnggota());
            view.getCboKodeBuku().setSelectedItem(pm.getKodebuku());
            view.getTxtTglpinjam().setText(pm.getTglpinjam());
            view.getTxtTglKembali().setText(pm.getTglkembali());
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
    
    public void tampil(){
        try {
            DefaultTableModel tabelModel =
                    (DefaultTableModel) view.gettblpeminjaman().getModel();
            tabelModel.setRowCount(0);
            List<Peminjaman> list = dao.getAll();
            for(Peminjaman p : list){
                Object[] row = {
                    p.getKodepeminjaman(),
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
