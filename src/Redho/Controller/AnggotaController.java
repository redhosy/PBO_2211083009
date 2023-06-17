/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho.Controller;

import Redho.View.*;
import Redho.Model.Anggota;
import Redho.Dao.*;
import Redho.db.dbHelper;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import java.util.logging.*;
import javax.swing.JOptionPane;


/**
 *
 * @author septa
 */
public class AnggotaController{
    FormAnggota view;
    AnggotaDao dao;
    Anggota anggota;
    Connection con;
    
    public AnggotaController(FormAnggota view){
        try {
            this.view = view;
            con = dbHelper.getConnection();
            dao = new AnggotaDaolmpl(con);
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void bersihForm(){
        view.getTxtKodeanggota().setText("");
        view.getTxtNamaanggota().setText("");
        view.getTxtAlamat().setText("");
        
        view.getCboJeniskelamin().removeAllItems();
        view.getCboJeniskelamin().addItem("L");
        view.getCboJeniskelamin().addItem("P");
    }
    
    public void insert(){
        try {
            anggota = new Anggota();
            anggota.setKodeanggota(view.getTxtKodeanggota().getText());
            anggota.setNamaanggota(view.getTxtNamaanggota().getText());
            anggota.setAlamat(view.getTxtAlamat().getText());
            anggota.setJeniskelamin(view.getCboJeniskelamin().getSelectedItem().toString());
            dao.insert(anggota);
            javax.swing.JOptionPane.showMessageDialog(view, "Entry berhasil");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(){
        try {
            anggota = new Anggota();
            anggota.setKodeanggota(view.getTxtKodeanggota().getText());
            anggota.setNamaanggota(view.getTxtNamaanggota().getText());
            anggota.setAlamat(view.getTxtAlamat().getText());
            anggota.setJeniskelamin(view.getCboJeniskelamin().getSelectedItem().toString());
            dao.update(anggota);
            javax.swing.JOptionPane.showMessageDialog(view, "Entry berhasil");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(){
        try {
            dao.delete(anggota);
            JOptionPane.showMessageDialog(view, "delete oke");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public void tableklik(){
        try {
            String kodeAnggota = view.gettblanggota().getValueAt(view.gettblanggota().getSelectedRow(), 0).toString();
            anggota = dao.getAnggota(kodeAnggota);
            view.getTxtKodeanggota().setText(anggota.getKodeanggota());
            view.getTxtNamaanggota().setText(anggota.getNamaanggota());
            view.getTxtAlamat().setText(anggota.getAlamat());
            view.getCboJeniskelamin().setSelectedItem(anggota.getJeniskelamin());
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    public void tampil(){
        try {
            DefaultTableModel tabelModel =
                    (DefaultTableModel) view.gettblanggota().getModel();
            tabelModel.setRowCount(0);
            List<Anggota> list = dao.getAll();
            for(Anggota a : list){
                Object[] row ={
                    a.getKodeanggota(),
                    a.getNamaanggota(),
                    a.getJeniskelamin(),
                    a.getAlamat(),
                };
                tabelModel.addRow(row);
            }
        } catch (Exception ex){
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}