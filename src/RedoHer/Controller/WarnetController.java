/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RedoHer.Controller;

import RedoHer.View.FormWarnet;
import RedoHer.Dao.*;
import RedoHer.Model.*;
import RedoHerdb.dbHer;
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
public class WarnetController {
private FormWarnet view;
private WarnetDao dao;
private Warnet w;
private Connection con;

public WarnetController(FormWarnet view)throws Exception{
            this.view = view;
            con = dbHer.getConnection();
            dao = new WarnetDaoImpl(con){};
            w = new Warnet();
}

 public void bersih()throws Exception{
       List<Warnet> Wlist = dao.getAll();
       view.getTxtkode().setText("");
       view.getTxtnama().setText("");
       view.getTxttglmasuk().setText("");
       view.getTxtjammasuk().setText("");
       view.getTxtjamkeluar().setText("");
    }

public void insert() {
    try {
        w = new Warnet();
        w.setKodetr(view.getTxtkode().getText());
        w.setNamapel(view.getTxtnama().getText());
        w.setTglmasuk(view.getTxttglmasuk().getText());
        w.setJammasuk(Integer.parseInt(view.getTxtjammasuk().getText()));
        w.setJamkeluar(Integer.parseInt(view.getTxtjamkeluar().getText()));
        w.setTarif(Integer.parseInt(view.getTxttarif().getText()));
        dao.insert(w);
    } catch (Exception ex) {
        Logger.getLogger(WarnetController.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void update(){
    try {
        w = new Warnet();
        w.setKodetr(view.getTxtkode().getText());
        w.setNamapel(view.getTxtnama().getText());
        w.setTglmasuk(view.getTxttglmasuk().getText());
        w.setJammasuk(Integer.parseInt(view.getTxtjammasuk().getText()));
        w.setJamkeluar(Integer.parseInt(view.getTxtjamkeluar().getText()));
        w.setTarif(Integer.parseInt(view.getTxttarif().getText()));
        dao.update(w);
    } catch (Exception ex) {
        Logger.getLogger(WarnetController.class.getName()).log(Level.SEVERE, null, ex);
    }
}

 public void delete(){
    try {
        dao.delete(w);
        JOptionPane.showMessageDialog(view, "delete oke");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(view, ex.getMessage());
        Logger.getLogger(WarnetController.class.getName()).log(Level.SEVERE, null, ex);
    }
}
public void tableklik(){
    try {
        String kodetr = view.getTblwarnet().getValueAt(view.getTblwarnet().getSelectedRow(), 0).toString();
        w = dao.getWarnet(kodetr);
        view.getTxtkode().setText(w.getKodetr());
        view.getTxtnama().setText(w.getNamapel());
        view.getTxttglmasuk().setText( w.getTglmasuk());
        view.getTxtjammasuk().setText( "" + w.getJammasuk());
        view.getTxtjamkeluar().setText( "" + w.getJamkeluar());
        view.getTxttarif().setText( "" + w.getTarif());
    } catch (Exception ex) {
        Logger.getLogger(Warnet.class.getName()).log(Level.SEVERE, null, ex);
    }
}

 public void tampil(){
        try {
            DefaultTableModel tableModel =
                    (DefaultTableModel) view.getTblwarnet().getModel();
            tableModel.setRowCount(0);
            List <Warnet> list = dao.getAll();
            for(Warnet w : list){
                Object[] row ={
                    w.getKodetr(),
                    w.getNamapel(),
                    w.getTglmasuk(),
                    w.getJammasuk(),
                    w.getJamkeluar(),
                    w.getLama(),
                    w.getTarif(),
                    w.getDiskon(),
                    w.getTotal()
                };
                tableModel.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(WarnetController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
