/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho060523.Controller;
import Redho060523.Model.*;
import Redho060523.view.FormGaji;
import javax.swing.table.DefaultTableModel;
import java.util.*;
/**
 *
 * @author septa
 */
public class GajiController {
    private FormGaji formgaji;
    private GajiDao gajiDao;
    private Gaji gaji;
    private Karyawan karyawan;
    
    private KaryawanDao karyawanDao;
    
    public GajiController(FormGaji formgaji){
        this.formgaji = formgaji;
        gajiDao = new GajiDaolmpl();
        karyawanDao = new KaryawanDaolmpl();
    }
     public void bersihForm(){
        formgaji.getTxtBulan().setText("");
        formgaji.getTxtTahun().setText("");
    }
     public void isiCombo(){
        List<Karyawan> listKaryawan = karyawanDao.getAll();
        List<Gaji> listGaji = gajiDao.getAll();
        formgaji.getcbokaryawan().removeAllItems();
   
        for (Karyawan karyawan: listKaryawan) {
        formgaji.getcbokaryawan().addItem(karyawan.getnip());
        }
    }
      public void getGaji(){
        int index = formgaji.getTblgaji().getSelectedRow();
        gaji = gajiDao.getGaji(index);
        if(karyawan != null){
            formgaji.getcbokaryawan().setSelectedItem(gaji.getKaryawan().getnip());
            formgaji.getTxtBulan().setText(" " +gaji.getbulan());
            formgaji.getTxtTahun().setText(" " +gaji.gettahun());
        }
    }
    public void saveGaji(){
        gaji = new Gaji();
        gaji.setKaryawan(karyawanDao.getKaryawan(formgaji.getcbokaryawan().getSelectedIndex()));
        gaji.setbulan(formgaji.getTxtBulan().getText());
        gaji.settahun(formgaji.getTxtTahun().getText());
        gaji.setgajipokok(""+karyawanDao.getKaryawan(formgaji.getcbokaryawan().getSelectedIndex()).getgolongan());
        gaji.settunjangananak(karyawanDao.getKaryawan(formgaji.getcbokaryawan().getSelectedIndex()));
        gaji.settunjanganistri(karyawanDao.getKaryawan(formgaji.getcbokaryawan().getSelectedIndex()));
        gaji.settotalgaji();
        gajiDao.save(gaji);
        javax.swing.JOptionPane.showMessageDialog(formgaji, "Entry sukses");
    }
        public void updateGaji(){
        int index = formgaji.getTblgaji().getSelectedRow();
        gaji.setKaryawan(karyawanDao.getKaryawan(formgaji.getcbokaryawan().getSelectedIndex()));
        gaji.setbulan(formgaji.getTxtBulan().getText());
        gaji.settahun(formgaji.getTxtTahun().getText());
        gaji.setgajipokok(""+karyawanDao.getKaryawan(formgaji.getcbokaryawan().getSelectedIndex()).getgolongan());
        gaji.settunjangananak(karyawanDao.getKaryawan(formgaji.getcbokaryawan().getSelectedIndex()));
        gaji.settunjanganistri(karyawanDao.getKaryawan(formgaji.getcbokaryawan().getSelectedIndex()));
        gaji.settotalgaji();
        gajiDao.update(index, gaji);
        javax.swing.JOptionPane.showMessageDialog(formgaji,  "Update Okee");
    }
     public void deleteGaji(){
        int index = formgaji.getTblgaji().getSelectedRow();
        gajiDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formgaji,  "Delete Okee");
    }
    public void tampilData(){
         DefaultTableModel tabelModel = 
                (DefaultTableModel)formgaji.getTblgaji().getModel();
            tabelModel.setRowCount(0);
             java.util.List<Gaji> List = gajiDao.getAll();
             for(Gaji gaji : List){
                   Object[] data = {
                      gaji.getKaryawan().getnama(),
                      gaji.getKaryawan().getnip(),
                      gaji.getbulan(),
                      gaji.gettahun(),
                      gaji.getgajipokok(),
                      gaji.gettunjangananak(),
                      gaji.gettunjanganistri(),
                      gaji.gettotalgaji(),
            };
            tabelModel.addRow(data);
        }
    }
}
    
        
     

