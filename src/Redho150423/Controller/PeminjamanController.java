/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho150423.Controller;
import Redho150423.Model.*;
import Redho150423.View.FormPeminjaman;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author septa
 */
public class PeminjamanController {
    private FormPeminjaman formPeminjaman;
    private PeminjamanDao peminjamanDao;
    private Peminjaman peminjaman;
    
      public PeminjamanController(FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        peminjamanDao = new PeminjamanDaolmpl();
    }
    public void bersihForm(){
        formPeminjaman.getTxtNobp().setText("");
        formPeminjaman.getTxtNama().setText("");
        formPeminjaman.getTxtKodeBuku().setText("");
        formPeminjaman.getTxtTglpinjam().setText("");
        formPeminjaman.getTxtTglKembali().setText("");
    }
    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setNobp(formPeminjaman.getTxtNobp().getText());
        peminjaman.setNama(formPeminjaman.getTxtNama().getText());
        peminjaman.setKodebuku(formPeminjaman.getTxtKodeBuku().getText());
        peminjaman.setTglpinjam(formPeminjaman.getTxtTglpinjam().getText());
        peminjaman.setTglkembali(formPeminjaman.getTxtTglKembali().getText());
        peminjamanDao.save(peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman,  "Entry Okee");
    }
    public void getPeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            formPeminjaman.getTxtNobp().setText(peminjaman.getnobp());
            formPeminjaman.getTxtNama().setText(peminjaman.getNama());
            formPeminjaman.getTxtKodeBuku().setText(peminjaman.getKodebuku());
            formPeminjaman.getTxtTglpinjam().setText(peminjaman.gettglpinjam());
            formPeminjaman.getTxtTglKembali().setText(peminjaman.gettglkembali());
        }
    }
     public void updatePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman.setNobp(formPeminjaman.getTxtNobp().getText());
        peminjaman.setNama(formPeminjaman.getTxtNama().getText());
        peminjaman.setKodebuku(formPeminjaman.getTxtKodeBuku().getText());
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
                      peminjaman.getnobp(),
                      peminjaman.getNama(),
                      peminjaman.getKodebuku(),
                      peminjaman.gettglpinjam(),
                      peminjaman.gettglkembali(),
            };
            tabelModel.addRow(data);
        }
    }
}