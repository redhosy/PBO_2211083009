/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Redho.View;

import Redho.Controller.PengembalianController;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author septa
 */
public class FormPengembalian extends javax.swing.JFrame {

    /**
     * Creates new form FormPengembalian
     */
    private PengembalianController con;
    public FormPengembalian() throws Exception {
        initComponents();
        con = new PengembalianController(this);
        con.bersih();
        con.tampil();  
    }

    public JComboBox<String> getCbokodeanggota() {
        return cbokodeanggota;
    }

    public JComboBox<String> getCbokodebuku() {
        return cbokodebuku;
    }

    public JComboBox<String> getCbopilih() {
        return cbopilih;
    }

    public JTextField getTxttglpinjam() {
        return txttglpinjam;
    }

    public JTextField getTxtdenda() {
        return txtdenda;
    }

    public JTextField getTxtterlambat() {
        return txtterlambat;
    }

    public JTextField getTxttgldikembalikan() {
        return txttglkembali;
    }

    public JTextField getTxtcari() {
        return txtcari;
    }
    
    public JTable getTblpengembalian() {
        return tblpengembalian;
    }

    public JButton getBtnkembalikan() {
        return btnkembalikan;
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbokodeanggota = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtdenda = new javax.swing.JTextField();
        txtcari = new javax.swing.JTextField();
        txtterlambat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpengembalian = new javax.swing.JTable();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btncari = new javax.swing.JButton();
        btnkembalikan = new javax.swing.JButton();
        cbokodebuku = new javax.swing.JComboBox<>();
        txttglkembali = new javax.swing.JTextField();
        txttglpinjam = new javax.swing.JTextField();
        btncancel1 = new javax.swing.JButton();
        cbopilih = new javax.swing.JComboBox<>();
        btnpinjamlgi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Kode Anggota");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(18, 39, 80, 16);

        jLabel2.setText("Terlambat");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 190, 70, 16);

        cbokodeanggota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbokodeanggota);
        cbokodeanggota.setBounds(120, 40, 270, 22);

        jLabel3.setText("Kode Buku");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 70, 70, 16);

        jLabel4.setText("Kode Buku");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 70, 70, 16);

        jLabel5.setText("Tgl Pinjam");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 110, 70, 16);

        jLabel6.setText("Denda");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 230, 70, 16);

        jLabel7.setText("Tgldikembalikan");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 150, 100, 16);

        txtdenda.setText("jTextField1");
        getContentPane().add(txtdenda);
        txtdenda.setBounds(120, 220, 270, 30);

        txtcari.setText("jTextField1");
        txtcari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcariFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcariFocusLost(evt);
            }
        });
        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });
        getContentPane().add(txtcari);
        txtcari.setBounds(560, 40, 270, 30);

        txtterlambat.setText("jTextField1");
        txtterlambat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtterlambatActionPerformed(evt);
            }
        });
        getContentPane().add(txtterlambat);
        txtterlambat.setBounds(120, 180, 270, 30);

        tblpengembalian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode Anggota", "Nama Anggota", "Kode Buku", "Judul Buku", "Tgl Pinjam", "Tgl Kembali", "Dikembalikan", "Terlambat", "Denda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblpengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpengembalianMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblpengembalian);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(410, 80, 840, 220);

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete);
        btndelete.setBounds(300, 260, 72, 23);

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate);
        btnupdate.setBounds(120, 260, 72, 23);

        btncari.setText("Cari");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });
        getContentPane().add(btncari);
        btncari.setBounds(850, 40, 60, 30);

        btnkembalikan.setText("Kembalikan");
        btnkembalikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembalikanActionPerformed(evt);
            }
        });
        getContentPane().add(btnkembalikan);
        btnkembalikan.setBounds(410, 310, 100, 23);

        cbokodebuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbokodebuku);
        cbokodebuku.setBounds(120, 70, 270, 22);

        txttglkembali.setText("jTextField1");
        txttglkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttglkembaliActionPerformed(evt);
            }
        });
        txttglkembali.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttglkembaliKeyReleased(evt);
            }
        });
        getContentPane().add(txttglkembali);
        txttglkembali.setBounds(120, 140, 270, 30);

        txttglpinjam.setText("jTextField1");
        txttglpinjam.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txttglpinjamFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txttglpinjamFocusLost(evt);
            }
        });
        txttglpinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttglpinjamActionPerformed(evt);
            }
        });
        getContentPane().add(txttglpinjam);
        txttglpinjam.setBounds(120, 100, 270, 30);

        btncancel1.setText("Cancel");
        btncancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancel1ActionPerformed(evt);
            }
        });
        getContentPane().add(btncancel1);
        btncancel1.setBounds(210, 260, 72, 23);

        cbopilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KodeAnggota", "NamaAnggota", "KodeBuku" }));
        getContentPane().add(cbopilih);
        cbopilih.setBounds(410, 40, 140, 30);

        btnpinjamlgi.setText("Pinjam Lagi ?");
        btnpinjamlgi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpinjamlgiActionPerformed(evt);
            }
        });
        getContentPane().add(btnpinjamlgi);
        btnpinjamlgi.setBounds(530, 310, 110, 23);

        setSize(new java.awt.Dimension(1324, 445));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        con.update();
        con.bersih();
        con.tampil();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        // TODO add your handling code here:
        con.Cari();
    }//GEN-LAST:event_btncariActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        con.delete();
        con.bersih();
        con.tampil();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnkembalikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembalikanActionPerformed
        // TODO add your handling code here:
        con.insert();
        con.bersih();
        con.tampil();
    }//GEN-LAST:event_btnkembalikanActionPerformed

    private void tblpengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpengembalianMouseClicked
        // TODO add your handling code here:
        con.get();
    }//GEN-LAST:event_tblpengembalianMouseClicked

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtcariActionPerformed

    private void txttglpinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttglpinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttglpinjamActionPerformed

    private void btncancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancel1ActionPerformed
        // TODO add your handling code here:
        con.bersih();
        con.tampil();
    }//GEN-LAST:event_btncancel1ActionPerformed

    private void txtcariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcariFocusGained
        // TODO add your handling code here:
        if(txtcari.getText().equals("masukkan kode anggota")){
            txtcari.setText("");
        }
    }//GEN-LAST:event_txtcariFocusGained

    private void txtcariFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcariFocusLost
        // TODO add your handling code here:
         if(txtcari.getText().equals("")){
            txtcari.setText("masukkan kode anggota");
        }
    }//GEN-LAST:event_txtcariFocusLost

    private void txttglkembaliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttglkembaliKeyReleased
        try {
            con.tanggalDikembalikan();
        } catch (Exception ex) {
            Logger.getLogger(FormPengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txttglkembaliKeyReleased

    private void txtterlambatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtterlambatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtterlambatActionPerformed

    private void txttglkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttglkembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttglkembaliActionPerformed

    private void txttglpinjamFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttglpinjamFocusGained
        // TODO add your handling code here:
        if(txttglpinjam.getText().equals("yyyy-mm-dd")){
            txttglpinjam.setText("");
        }
    }//GEN-LAST:event_txttglpinjamFocusGained

    private void txttglpinjamFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttglpinjamFocusLost
        // TODO add your handling code here:
        if(txttglpinjam.getText().equals("")){
            txttglpinjam.setText("yyyy-mm-dd");
        }
    }//GEN-LAST:event_txttglpinjamFocusLost

    private void btnpinjamlgiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpinjamlgiActionPerformed
        // TODO add your handling code here:
        FormPeminjaman fp = new FormPeminjaman();
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnpinjamlgiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormPengembalian().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(FormPengembalian.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel1;
    private javax.swing.JButton btncari;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnkembalikan;
    private javax.swing.JButton btnpinjamlgi;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cbokodeanggota;
    private javax.swing.JComboBox<String> cbokodebuku;
    private javax.swing.JComboBox<String> cbopilih;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblpengembalian;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtdenda;
    private javax.swing.JTextField txtterlambat;
    private javax.swing.JTextField txttglkembali;
    private javax.swing.JTextField txttglpinjam;
    // End of variables declaration//GEN-END:variables
}
