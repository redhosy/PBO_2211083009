/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho150423.Model;

/**
 *
 * @author septa
 */
public class Peminjaman {
    private String nobp;
    private String nama;
    private String kodebuku;
    private String tglpinjam;
    private String tglkembali;
    
public Peminjaman(){}
public Peminjaman(String nobp, String nama, String kodebuku,String tglpinjam,String tglkembali){
       this.nobp = nobp;
       this.nama = nama;
       this.kodebuku = kodebuku;
       this.tglpinjam = tglpinjam;
       this.tglkembali = tglkembali;
       }
public String getnobp(){
    return nobp;
    }
public void setNobp(String nobp){
    this.nobp = nobp;
    }
public String getNama(){
    return nama;
    }
public void setNama(String Nama){
    this.nama = Nama;
    }
public String getKodebuku(){
    return kodebuku;
    }
public void setKodebuku(String kodebuku){
    this.kodebuku = kodebuku;
    }
public String gettglpinjam(){
    return tglpinjam;
    }
public void setTglpinjam(String tglpinjam){
    this.tglpinjam = tglpinjam;
    }
public String gettglkembali(){
    return tglkembali;
    }
public void setTglkembali(String tglkembali){
    this.tglkembali = tglkembali;
    }

}