/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho.Controller;

import Redho.View.FormMahasiswa;
import Redho.Dao.*;
import Redho.Model.*;
import Redho.db.dbHelper;
import java.sql.Connection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author septa
 */
public class MahasiswaController {
private FormMahasiswa view;
private MahasiswaDao dao;
private Mahasiswa m;
private Connection con;

 public MahasiswaController(FormMahasiswa view)throws Exception{
            this.view = view;
            con = dbHelper.getConnection();
            dao = new MahasiswaDaoImpl(con);
            m = new Mahasiswa();
}
 
 public void bersih()throws Exception{
       List<Mahasiswa> Mlist = dao.getAll();
       view.getTxtnim().setText("");
       view.getTxtnama().setText("");
       view.getTxtusia().setText("");
    }
   
public void insert() {
    try {
        m = new Mahasiswa();
        m.setNim(view.getTxtnim().getText());
        m.setNama(view.getTxtnama().getText());
        m.setUsia(Integer.parseInt(view.getTxtusia().getText()));
        m.setHitungukt(Integer.parseInt(view.getTxtusia().getText()));
        dao.insert(m);
    } catch (Exception ex) {
        Logger.getLogger(MahasiswaController.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void update(){
    try {
        m.setNim(view.getTxtnim().getText());
        m.setNama(view.getTxtnama().getText());
        m.setUsia(Integer.parseInt(view.getTxtusia().getText()));
        m.setHitungukt(Integer.parseInt(view.getTxtusia().getText()));
        dao.update(m);
    } catch (Exception ex) {
        Logger.getLogger(MahasiswaController.class.getName()).log(Level.SEVERE, null, ex);
    }
}

 public void delete(){
    try {
        dao.delete(m);
        JOptionPane.showMessageDialog(view, "delete oke");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(view, ex.getMessage());
        Logger.getLogger(MahasiswaController.class.getName()).log(Level.SEVERE, null, ex);
    }
}
public void tableklik(){
    try {
        String Nim = view.getTblmahasiswa().getValueAt(view.getTblmahasiswa().getSelectedRow(), 0).toString();
        m = dao.getMahasiswa(Nim);
        view.getTxtnim().setText(m.getNim());
        view.getTxtnama().setText(m.getNama());
        view.getTxtusia().setText(""+ m.getUsia());
    } catch (Exception ex) {
        Logger.getLogger(MahasiswaController.class.getName()).log(Level.SEVERE, null, ex);
    }
}

 public void tampil(){
        try {
            DefaultTableModel tableModel =
                    (DefaultTableModel) view.getTblmahasiswa().getModel();
            tableModel.setRowCount(0);
            List <Mahasiswa> list = dao.getAll();
            for(Mahasiswa m : list){
                Object[] row ={
                    m.getNim(),
                    m.getNama(),
                    m.getUsia(),
                    m.getHitungukt()
                };
                tableModel.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
