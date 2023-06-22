/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho.Controller;
import Redho.Model.*;
import Redho.Dao.*;
import Redho.View.FormBuku;
import Redho.db.dbHelper;
import java.sql.*;
import java.util.List;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author septa
 */
public class BukuController {
    FormBuku view;
    BukuDao dao;
    Buku buku;
    Connection con;
    
    public BukuController(FormBuku view){
        try {
            this.view = view;
            con = dbHelper.getConnection();
            dao = new BukuDaolmpl(con);
        } catch (SQLException ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public void bersih(){
        view.getTxtKodeBuku().setText("");
        view.getTxtJudulBuku().setText("");
        view.getTxtPengarang().setText("");
        view.getTxtPenerbit().setText("");
    }
    
    public void insert(){
        try {
            buku = new Buku();
            buku.setKodebuku(view.getTxtKodeBuku().getText());
            buku.setJudulbuku(view.getTxtJudulBuku().getText());
            buku.setPengarang(view.getTxtPengarang().getText());
            buku.setPenerbit(view.getTxtPenerbit().getText());
            dao.insert(buku);
        } catch (Exception ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(){
        try {
            buku = new Buku();
            buku.setJudulbuku(view.getTxtJudulBuku().getText());
            buku.setPengarang(view.getTxtPengarang().getText());
            buku.setPenerbit(view.getTxtPenerbit().getText());
            buku.setKodebuku(view.getTxtKodeBuku().getText());
            dao.update(buku);
        } catch (Exception ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(){
        try {
            dao.delete(buku);
            JOptionPane.showMessageDialog(view, "delete okey");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tableklik(){
        try {
            String Kodebuku = view.gettblBuku().getValueAt(view.gettblBuku().getSelectedRow(), 0).toString();
            buku = dao.getBuku(Kodebuku);
            view.getTxtKodeBuku().setText(buku.getKodebuku());
            view.getTxtJudulBuku().setText(buku.getJudulbuku());
            view.getTxtPengarang().setText(buku.getPengarang());
            view.getTxtPenerbit().setText(buku.getPenerbit());
        } catch (Exception ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tampil(){
        try {
            DefaultTableModel tableModel =
                    (DefaultTableModel) view.gettblBuku().getModel();
            tableModel.setRowCount(0);
            List <Buku> list = dao.getAll();
            for(Buku b : list){
                Object[] row ={
                    b.getKodebuku(),
                    b.getJudulbuku(),
                    b.getPengarang(),
                    b.getPenerbit()
                };
                tableModel.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
