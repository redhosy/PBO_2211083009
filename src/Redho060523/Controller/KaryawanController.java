
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho060523.Controller;
import Redho060523.view.FormKaryawan;
import Redho060523.Model.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
/**
 *
 * @author septa
 */
public class KaryawanController {
    private FormKaryawan formkaryawan;
    private KaryawanDao karyawanDao;
    private Karyawan karyawan;
    
    private People people;
    
    public KaryawanController(FormKaryawan formkaryawan){
        this.formkaryawan = formkaryawan;
        karyawanDao = new KaryawanDaolmpl();
    }
    public void bersihForm(){
        formkaryawan.getTxtNip().setText("");
        formkaryawan.getTxtNama().setText("");
        formkaryawan.getTxtAlamat().setText("");
        formkaryawan.getTxtStatusNikah().setText("");
        formkaryawan.getTxtJabatan().setText("");
        formkaryawan.getCboGolongan().setSelectedIndex(0);
        formkaryawan.getTxtJabatan().setText("");
        
    }
    public void isiCombo(){
        List<Karyawan> listKaryawan = karyawanDao.getAll();
        formkaryawan.getCboGolongan().removeAllItems();
        formkaryawan.getCboJumlahanak().removeAllItems();
        
        for (Karyawan karyawan : listKaryawan){
            formkaryawan.getCboGolongan().addItem(karyawan.getgolongan());
        }
        for (Karyawan karyawan : listKaryawan){
            formkaryawan.getCboJumlahanak().addItem(karyawan.getjumlahanak());
        }
       
    }
    public void saveKaryawan(){
        karyawan = new Karyawan();
        people = new People();
        karyawan.setnip(formkaryawan.getTxtNip().getText());
        karyawan.setnama(formkaryawan.getTxtNama().getText());
        karyawan.setalamat(formkaryawan.getTxtAlamat().getText());
        karyawan.setstatusnikah(formkaryawan.getTxtStatusNikah().getText());
        karyawan.setjabatan(formkaryawan.getTxtJabatan().getText());
        karyawan.setgolongan(formkaryawan.getCboGolongan().getSelectedIndex());
        karyawan.setjumlahanak(formkaryawan.getCboJumlahanak().getSelectedIndex());
        karyawanDao.save(karyawan);
        javax.swing.JOptionPane.showMessageDialog(formkaryawan,  "Entry sukses");
    }
    public void getKaryawan(){
        int index = formkaryawan.getTblKaryawan().getSelectedRow();
        karyawan = karyawanDao.getKaryawan(index);
        if(karyawan != null){
            formkaryawan.getTxtNip().setText(karyawan.getnip());
            formkaryawan.getTxtNama().setText(karyawan.getnama());
            formkaryawan.getTxtAlamat().setText(karyawan.getalamat());
            formkaryawan.getTxtStatusNikah().setText(karyawan.getstatusNikah());
            formkaryawan.getTxtJabatan().setText(karyawan.getjabatan());
            formkaryawan.getCboGolongan().setSelectedIndex(karyawan.getgolongan());
            formkaryawan.getCboJumlahanak().setSelectedIndex(karyawan.getjumlahanak());
        }
    }
     public void updateKaryawan(){
        int index = formkaryawan.getTblKaryawan().getSelectedRow();
        karyawan.setnip(formkaryawan.getTxtNip().getText());
        karyawan.setnama(formkaryawan.getTxtNama().getText());
        karyawan.setalamat(formkaryawan.getTxtAlamat().getText());
        karyawan.setstatusnikah(formkaryawan.getTxtStatusNikah().getText());
        karyawan.setjabatan(formkaryawan.getTxtJabatan().getText());
        karyawan.setgolongan(formkaryawan.getCboGolongan().getSelectedIndex());
        karyawan.setjumlahanak(formkaryawan.getCboJumlahanak().getSelectedIndex());
        karyawanDao.update(index, karyawan);
         javax.swing.JOptionPane.showMessageDialog(formkaryawan,  "Update sukses");
    }
    public void deleteKaryawan(){
        int index = formkaryawan.getTblKaryawan().getSelectedRow();
        karyawanDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formkaryawan,  "Delete sukses");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel)formkaryawan.getTblKaryawan().getModel();
      tabelModel.setRowCount(0);
        java.util.List<Karyawan> List = karyawanDao.getAll();
        for(Karyawan karyawan : List){
            Object[] data = {
                karyawan.getnip(),
                karyawan.getnama(),
                karyawan.getalamat(),
                karyawan.getstatusNikah(),
                karyawan.getjabatan(),
                karyawan.getgolongan(),
                karyawan.getjumlahanak(),
            };
            tabelModel.addRow(data);
        }
    }
}
