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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author septa
 */
public class PengembalianController {
   private FormPengembalian view;
   private AnggotaDao Adao;
   private BukuDao Bdao;
   private Connection con;
   private Pengembalian kembali;
   private PengembalianDao pengembalianDao;
   private Peminjaman pinjam;
   private PeminjamanDao peminjamanDao;

    public PengembalianController(FormPengembalian view) {
        try {
            this.view = view;
            kembali = new Pengembalian();
            con = dbHelper.getConnection();
            pengembalianDao = new PengembalianDaolmpl(con);
            Adao = new AnggotaDaolmpl(con);
            Bdao = new BukuDaolmpl(con);
            peminjamanDao = new PeminjamanDaolmpl(con);
        } catch (SQLException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void bersih() {
        view.getTxtDenda().setText("")
        
    }
    public void insert(){
        pkembali = new Pengembalian();
        
    }
    public void getPengembalian(){
        pkembali = new Pengembalian();
        String kodeanggota = view.get
    }
    
    
   
    
}
