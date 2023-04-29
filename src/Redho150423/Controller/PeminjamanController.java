/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho150423.Controller;
import Redho150423.Model.*;
import Redho150423.View.FormPeminjaman;
import javax.swing.table.DefaultTableModel;
import java.util.*;

/**
 *
 * @author septa
 */
public class PeminjamanController {
    private FormPeminjaman formPeminjaman;
    private PeminjamanDao peminjamanDao;
    private Peminjaman peminjaman;
    
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    
    public PeminjamanController(FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        peminjamanDao = new PeminjamanDaolmpl();
        anggotaDao = new AnggotaDaoImp1();
        bukuDao = new BukuDaolmpl();
    }
    public void bersihForm(){
        formPeminjaman.getTxtTglpinjam().setText("");
        formPeminjaman.getTxtTglKembali().setText("");
    }
    
    public void isiCombo(){
        List<Anggota> listAnggota = anggotaDao.getAll();
        List<Buku> listBuku = bukuDao.getAll();
        formPeminjaman.getCboAnggota().removeAllItems();
        formPeminjaman.getCboBuku().removeAllItems();
        
        for (Anggota anggota : listAnggota){
            formPeminjaman.getCboAnggota().addItem(anggota.getNobp());
        }
        for (Buku buku : listBuku){
            formPeminjaman.getCboBuku().addItem(buku.getKode());
        }
    }
    
    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setAnggota(anggotaDao.getAnggota(formPeminjaman.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(bukuDao.getBuku(formPeminjaman.getCboBuku().getSelectedIndex()));
        peminjaman.setTglpinjam(formPeminjaman.getTxtTglpinjam().getText());
        peminjaman.setTglkembali(formPeminjaman.getTxtTglKembali().getText());
        peminjamanDao.save(peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman,  "Entry Okee");
    }
    public void getPeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            formPeminjaman.getCboAnggota().setSelectedItem(peminjaman.getAnggota().getNobp());
            formPeminjaman.getCboBuku().setSelectedItem(peminjaman.getBuku().getKode());
            formPeminjaman.getTxtTglpinjam().setText(peminjaman.gettglpinjam());
            formPeminjaman.getTxtTglKembali().setText(peminjaman.gettglkembali());
        }
    }
     public void updatePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman.setAnggota(anggotaDao.getAnggota(formPeminjaman.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(bukuDao.getBuku(formPeminjaman.getCboBuku().getSelectedIndex()));
        peminjaman.setTglpinjam(formPeminjaman.getTxtTglpinjam().getText());
        peminjaman.setTglkembali(formPeminjaman.getTxtTglKembali().getText());
        peminjamanDao.update(index, peminjaman);
         javax.swing.JOptionPane.showMessageDialog(formPeminjaman,  "Update Okee");
    }
        public void deletePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman,  "Delete Okee");
    }
         public void tampilData(){
         DefaultTableModel tabelModel = 
                (DefaultTableModel)formPeminjaman.getTblPeminjaman().getModel();
            tabelModel.setRowCount(0);
             java.util.List<Peminjaman> List = peminjamanDao.getAll();
             for(Peminjaman peminjaman : List){
                   Object[] data = {
                      peminjaman.getAnggota().getNobp(),
                      peminjaman.getAnggota().getNama(),
                      peminjaman.getBuku().getKode(),
                      peminjaman.gettglpinjam(),
                      peminjaman.gettglkembali(),
            };
            tabelModel.addRow(data);
        }
    }
}