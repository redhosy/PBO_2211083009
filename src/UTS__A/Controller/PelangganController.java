/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS__A.Controller;
import  UTS_A.View.FormWarnet;
import  UTS__A.Model.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;
/**
 *
 * @author septa
 */
public class PelangganController {
    private FormWarnet FormWarnet;
    private PelangganDao pelangganDao;
    private Pelanggan pelanggan;
    private WarnetDaolmpl warnetDaolmpl;
    private Warnet warnet;
    
    public PelangganController(FormWarnet formwarnet){
        this.FormWarnet = formwarnet;
        pelangganDao = new PelangganDaolmpl();
        warnetDaolmpl = new WarnetDaolmpl();
    }
    public void bersihForm(){
        FormWarnet.getTxttglmasuk().setText("");
        FormWarnet.getTxtjammasuk().setText("");
        FormWarnet.getTxtjamkeluar().setText("");
    }
    public void isicombo(){
        List<Pelanggan> list = pelangganDao.getAll();
        FormWarnet.getCboKp().removeAllItems(); 
        for (Pelanggan pelanggan : list ){
            FormWarnet.getCboKp().addItem(pelanggan.getKp());
        }
    }
    
    public void save(){
        warnet = new Warnet();
        warnet.setPelanggan(pelangganDao.getPelanggan(FormWarnet.getCboKp().getSelectedIndex()));
        warnet.setTglMasuk(FormWarnet.getTxttglmasuk().getText());
        warnet.setJamMasuk(FormWarnet.getTxtjammasuk().getText());
        warnet.setJamKeluar(FormWarnet.getTxtjamkeluar().getText());
        warnet.getTotalBayar();
        warnet.getTarif();
        warnetDaolmpl.save(warnet);
        javax.swing.JOptionPane.showMessageDialog(FormWarnet,  "Entry Ok");
    }
    
    public void getWarnet(){
        int index = FormWarnet.getTblpelanggan().getSelectedRow();
        warnet = warnetDaolmpl.getWarnet(index);
        if(warnet != null){
            FormWarnet.getCboKp().setSelectedItem(warnet.getPelanggan().getKp());
            FormWarnet.getTxttglmasuk().setText(warnet.getTglMasuk());
            FormWarnet.getTxtjammasuk().setText(warnet.getJamMasuk());
            FormWarnet.getTxtjamkeluar().setText(warnet.getJamKeluar());
        }
    }
    
    public void update(){
        int index = FormWarnet.getTblpelanggan().getSelectedRow();
        warnet.setPelanggan(pelangganDao.getPelanggan(FormWarnet.getCboKp().getSelectedIndex()));
        warnet.setTglMasuk(FormWarnet.getTxttglmasuk().getText());
        warnet.setJamMasuk(FormWarnet.getTxtjammasuk().getText());
        warnet.setJamKeluar(FormWarnet.getTxtjamkeluar().getText());
        warnet.getTotalBayar();
        warnet.getTarif();
        warnetDaolmpl.update(index, warnet);
         javax.swing.JOptionPane.showMessageDialog(FormWarnet,  "Update Ok");
    }
    
    public void delete(){
        int index = FormWarnet.getTblpelanggan().getSelectedRow();
        warnetDaolmpl.delete(index);
        javax.swing.JOptionPane.showMessageDialog(FormWarnet,  "Delete Ok");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel)FormWarnet.getTblpelanggan().getModel();
      tabelModel.setRowCount(0);
        java.util.List<Warnet> List = warnetDaolmpl.getAll();
        for(Warnet warnet : List){
            Object[] data = {
                warnet.getPelanggan().getKp(),
                warnet.getPelanggan().getNp(),
                warnet.getPelanggan().getJs(),
                warnet.getTglMasuk(),
                warnet.getJamMasuk(),
                warnet.getJamKeluar(),
                warnet.getTarif(),
                warnet.getTotalBayar(),
            };
            tabelModel.addRow(data);
        }
    }
}


