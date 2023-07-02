/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho.Controller;

import java.sql.Connection;
import java.util.List;

import Redho.Dao.*;
import Redho.Model.*;
import Redho.View.FormPengembalian;
import Redho.db.dbHelper;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author septa
 */
public class PengembalianController {
   private FormPengembalian view;
   private AnggotaDao Adao;
   private BukuDao Bdao;
   private PengembalianDao pengembalianDao;
   private Pengembalian kembali;
   private Connection con;

    public PengembalianController (FormPengembalian view) throws Exception {
        this.view = view;
        con = dbHelper.getConnection();
        Adao = new AnggotaDaolmpl(con);
        Bdao = new BukuDaolmpl(con);
        pengembalianDao = new PengembalianDaolmpl(con);
        kembali = new Pengembalian();
    }
    
    public void bersih() {
        
       try {
           view.getBtnkembalikan().setEnabled(false);
           List<Anggota> alist = Adao.getAll();
           view.getCbokodeanggota().removeAllItems();
           for(Anggota anggota : alist){
               view.getCbokodeanggota().addItem(anggota.getKodeanggota());
           }
           view.getCbokodeanggota().setSelectedIndex(0);
           
           List<Buku> blist = Bdao.getAll();
           view.getCbokodebuku().removeAllItems();
           for(Buku buku  : blist){
               view.getCbokodebuku().addItem(buku.getKodebuku());
           }
           view.getCbokodeanggota().setSelectedIndex(0);
           
           view.getTxttglpinjam().setText("");
           view.getTxttgldikembalikan().setText("");
           view.getTxtcari().setText("");
           view.getTxtterlambat().setText("");
           view.getTxtdenda().setText("");
           
       } catch (Exception ex) {
           Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
     public void insert() {
        try {
            kembali.setKodeAnggota(view.getCbokodeanggota().getSelectedItem().toString());
            kembali.setKodebuku(view.getCbokodebuku().getSelectedItem().toString());
            kembali.setTglpinjam(view.getTxttglpinjam().getText());
            kembali.setTglkembali(view.getTxttgldikembalikan().getText());
            kembali.setTerlambat(Integer.parseInt(view.getTxtterlambat().getText()));
            kembali.setDenda(Double.parseDouble(view.getTxtdenda().getText()));
            pengembalianDao.insert(kembali);
            JOptionPane.showMessageDialog(view, "Berhasil Kembalikan Buku.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Tidak bisa melakukan pengembalian!", null, 0);
        }
    }
    
    public void update() {  
        try {
            kembali.setKodeAnggota(view.getCbokodeanggota().getSelectedItem().toString());
            kembali.setKodebuku(view.getCbokodebuku().getSelectedItem().toString());
            kembali.setTglpinjam(view.getTxttglpinjam().getText());
            kembali.setTglkembali(view.getTxttgldikembalikan().getText());
            kembali.setTerlambat(Integer.parseInt(view.getTxtterlambat().getText()));
            kembali.setDenda(Double.parseDouble(view.getTxtdenda().getText()));
            pengembalianDao.update(kembali);
            JOptionPane.showMessageDialog(view, "Berhasil Kembalikan Buku.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Tidak bisa melakukan pengembalian!", null, 0);
        }
    }
     public void delete() {
        try {
            kembali.setKodeAnggota(view.getTblpengembalian().getValueAt(view.getTblpengembalian().getSelectedRow(), 0)
                    .toString());
            kembali.setKodebuku(view.getTblpengembalian().getValueAt(view.getTblpengembalian().getSelectedRow(), 2)
                    .toString());
            kembali.setTglpinjam(view.getTblpengembalian().getValueAt(view.getTblpengembalian().getSelectedRow(), 4)
                    .toString());
            pengembalianDao.delete(kembali);
            JOptionPane.showMessageDialog(view, "Data pengembalian berhasil dihapus!", null, 2);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
     public void get() {
        try {
            view.getBtnkembalikan().setEnabled(true);
            String tglPinjam = view.getTblpengembalian().getValueAt(view.getTblpengembalian().getSelectedRow(), 4)
                    .toString();
            String tglkembali = view.getTblpengembalian().getValueAt(view.getTblpengembalian().getSelectedRow(), 5)
                    .toString();
            view.getCbokodeanggota()
                    .setSelectedItem(view.getTblpengembalian().getValueAt(view.getTblpengembalian().getSelectedRow(), 0)
                            .toString());
            view.getCbokodebuku()
                    .setSelectedItem(view.getTblpengembalian().getValueAt(view.getTblpengembalian().getSelectedRow(), 2)
                            .toString());
            view.getTxttglpinjam()
                    .setText(tglPinjam);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String tglDikembalikan = format.format(new java.util.Date());
            view.getTxttgldikembalikan().setText(tglDikembalikan);
            int terlambat = pengembalianDao.selisihtgl(tglDikembalikan, tglkembali);
            kembali.setTerlambat(terlambat);
            view.getTxtterlambat().setText("" + terlambat);
            view.getTxtdenda().setText((String.valueOf(kembali.getDenda())));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e, null, 0);
        }
    }
    
     public void tampil() {
        try {
            DefaultTableModel tableModel = (DefaultTableModel) view.getTblpengembalian().getModel();
            tableModel.setRowCount(0);
            List<Pengembalian> List = pengembalianDao.getAll();
            for (Pengembalian kembali : List) {
                Object[] data = {
                        kembali.getKodeAnggota(),
                        kembali.getNamaAnggota(),
                        kembali.getKodebuku(),
                        kembali.getJudulBuku(),
                        kembali.getTglpinjam(),
                        kembali.getTglkembali(),
                        kembali.getDikembalikan(),
                        kembali.getTerlambat(),
                        kembali.getDenda()
                };
                tableModel.addRow(data);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void Cari() {
        try {
            String kode = view.getTxtcari().getText();
            DefaultTableModel tableModel = (DefaultTableModel) view.getTblpengembalian().getModel();
            tableModel.setRowCount(0);
            List<Pengembalian> List = pengembalianDao.cari(kode);
            if (List.isEmpty()) {
                JOptionPane.showMessageDialog(view, "Kode Anggota '" + kode + "' Tidak dapat ditemukan");
            } else {
                for (Pengembalian kembali : List) {
                    Object[] data = {
                        kembali.getKodeAnggota(),
                        kembali.getNamaAnggota(),
                        kembali.getKodebuku(),
                        kembali.getJudulBuku(),
                        kembali.getTglpinjam(),
                        kembali.getTglkembali(),
                        kembali.getDikembalikan(),
                        kembali.getTerlambat(),
                        kembali.getDenda()
                    };
                    tableModel.addRow(data);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e, null, 0);
        }
    }

    public int tanggalDikembalikan() throws Exception {
        String tglDikembalikan = view.getTxttgldikembalikan().getText();
        String tanggalkembali = view.getTblpengembalian().getValueAt(view.getTblpengembalian().getSelectedRow(), 5)
                .toString();
        int terlambat = pengembalianDao.selisihtgl(tglDikembalikan, tanggalkembali);
        view.getTxtterlambat().setText("" + terlambat);
        view.getTxttgldikembalikan().setText(tglDikembalikan);
        view.getTxtdenda().setText((String.valueOf(terlambat * 2000)));
        return terlambat;
    }

}
