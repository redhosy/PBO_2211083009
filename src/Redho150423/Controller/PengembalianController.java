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
public class PengembalianController {
    private FormPeminjaman formPeminjaman;
    private PeminjamanDao peminjamanDao;
    private Peminjaman peminjaman;
    
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    private PengembalianDao pengembalianDao;
    private Pengembalian pengembalian;
    
    public PengembalianController(FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        peminjamanDao = new PeminjamanDaolmpl();
        anggotaDao = new AnggotaDaoImp1();
        bukuDao = new BukuDaolmpl();
        pengembalianDao = new PengembalianDaolmpl();
       
    }
    public void bersihForm(){
        formPeminjaman.getTxtTglpinjam().setText("");
        formPeminjaman.getTxtTglKembali().setText("");
        formPeminjaman.getTxtTglDikembalikan().setText("");
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
        
        pengembalian = new Pengembalian();
        pengembalian.setDikembalikan("");
        pengembalian.setterlambat("");
        pengembalian.setdenda();
        pengembalianDao.save(pengembalian);
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
         pengembalian = pengembalianDao.getPengembalian(index);
        if(pengembalian != null){
            formPeminjaman.getTxtTglDikembalikan().setText(pengembalian.getdikembalikan());
        }
    }
     public void updatePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman.setAnggota(anggotaDao.getAnggota(formPeminjaman.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(bukuDao.getBuku(formPeminjaman.getCboBuku().getSelectedIndex()));
        peminjaman.setTglpinjam(formPeminjaman.getTxtTglpinjam().getText());
        peminjaman.setTglkembali(formPeminjaman.getTxtTglKembali().getText());
        peminjamanDao.update(index, peminjaman);
        
        pengembalian.setDikembalikan(formPeminjaman.getTxtTglDikembalikan().getText());
        pengembalian.setterlambat(formPeminjaman.getTxtTglKembali().getText());
        pengembalian.setdenda();
        pengembalianDao.update(index,pengembalian);
         javax.swing.JOptionPane.showMessageDialog(formPeminjaman,  "Update Okee");
    }
    public void deletePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(index);
        pengembalianDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman,  "Delete Okee");
    }
    public void DikembalikanPeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        pengembalian.setDikembalikan(formPeminjaman.getTxtTglDikembalikan().getText());
        pengembalian.setterlambat(formPeminjaman.getTxtTglKembali().getText());
        pengembalian.setdenda();
        pengembalianDao.update(index, pengembalian);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman,  "Dikembalikan ya!");
    }
         public void tampilData(){
         DefaultTableModel tabelModel = 
                (DefaultTableModel)formPeminjaman.getTblPeminjaman().getModel();
            tabelModel.setRowCount(0);
            
             java.util.List<Peminjaman> ListPeminjaman = peminjamanDao.getAll();
             java.util.List<Pengembalian> ListPengembalian = pengembalianDao.getAll();
             List<Object[]>dataGabungan=new ArrayList<>();
             for(int i = 0; i < ListPeminjaman.size(); i++){
                 Peminjaman peminjaman = ListPeminjaman.get(i);
                 Pengembalian pengembalian = null;
                 if(i<ListPengembalian.size()){
                     pengembalian = ListPengembalian.get(i);
                 }
                   Object[] data = {
                      peminjaman.getAnggota().getNobp(),
                      peminjaman.getAnggota().getNama(),
                      peminjaman.getBuku().getKode(),
                      peminjaman.gettglpinjam(),
                      peminjaman.gettglkembali(),
                      (pengembalian == null) ?"" : pengembalian.getdikembalikan(),
                      (pengembalian == null) ?"" : pengembalian.getterlambat(),
                      (pengembalian == null) ?"" : pengembalian.getdenda(),
            };
            tabelModel.addRow(data);
        }
    }
}