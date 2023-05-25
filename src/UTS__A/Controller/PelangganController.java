/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS__A.Controller;
import  UTS_A.View.FormPelanggan;
import  UTS__A.Model.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author septa
 */
public class PelangganController {
    private FormPelanggan FormPelanggan;
    private PelangganDao pelangganDao;
    private Pelanggan pelanggan;
    
    public PelangganController(FormPelanggan formPelanggan){
        this.FormPelanggan = formPelanggan;
        pelangganDao = new PelangganDaolmpl();
    }
    public void bersihForm(){
        formPelanggan.getTxtKd().setText("");
        formPelanggan.getTxtNp().setText("");
        formPelanggan.getTxtJS().setText("");
    }
    public void savePelanggan(){
        pelanggan = new Pelanggan();
        pelanggan.setKp(FormPelanggan.getTxtKp().getText());
        pelanggan.setNP(FormPelanggan.getTxtNp().getText());
        pelanggan.setJs(FormPelanggan.getTxtJs().getText());
        pelanggan.save(pelanggan);
        javax.swing.JOptionPane.showMessageDialog(FormPelanggan,  "Entry Ok");
    }
    
    public void getAnggota(){
        int index = FormPelanggan.getTblPelanggan().getSelectedRow();
        pelanggan = pelanggan.getPelanggan(index);
        if(pelanggan != null){
            FormPelanggan.getTxtKp().setText(pelanggan.getKp());
            FormPelanggan.getTxtNp().setText(pelanggan.getNp());
            FormPelanggan.getTxtJs().setText(pelanggan.getJs());
        }
    }
    
    public void updateAnggota(){
        int index = FormPelanggan.getTblPelanggan().getSelectedRow();
        pelanggan.setKp(FormPelanggan.getTxtKp().getText());
        pelanggan.setNP(FormPelanggan.getTxtNp().getText());
        pelanggan.setJs(FormPelanggan.getTxtJs().getText());
        pelangganDao.update(index, pelanggan);
         javax.swing.JOptionPane.showMessageDialog(FormPelanggan,  "Update Ok");
    }
    
    public void deleteAnggota(){
        int index = FormPelanggan.getTblPelanggan().getSelectedRow();
        pelangganDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(FormPelanggan,  "Delete Ok");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel)FormPelanggan.getTblPelanggan().getModel();
      tabelModel.setRowCount(0);
        java.util.List<Pelanggan> List = pelangganDao.getAll();
        for(Pelanggan anggota : List){
            Object[] data = {
                anggota.getKd(),
                anggota.getNp(),
                anggota.getJS()
            };
            tabelModel.addRow(data);
        }
    }
}


