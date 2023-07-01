/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author septa
 */
public class Pengembalian {
    private String kodeAnggota;
    private String Kodebuku;
    private String tglpinjam;
    private String tglkembali;
    private int terlambat;
    private double denda;
    
    public Pengembalian(){}

    public Pengembalian(String kodeAnggota, String Kodebuku, String tglpinjam, String tglkembali, int terlambat, double denda) {
        this.kodeAnggota = kodeAnggota;
        this.Kodebuku = Kodebuku;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
        this.terlambat = terlambat;
        this.denda = denda;
    }

    public String getKodeAnggota() {
        return kodeAnggota;
    }

    public String getKodebuku() {
        return Kodebuku;
    }

    public String getTglpinjam() {
        return tglpinjam;
    }

    public String getTglkembali() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        tglkembali = format.format(new Date());
        return tglkembali;
    }

    public int getTerlambat() {
        return terlambat;
    }

    public double getDenda() {
        return denda;
    }

    public void setKodeAnggota(String kodeAnggota) {
        this.kodeAnggota = kodeAnggota;
    }

    public void setKodebuku(String Kodebuku) {
        this.Kodebuku = Kodebuku;
    }

    public void setTglpinjam(String tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public void setTglkembali(String tglkembali) {
        this.tglkembali = tglkembali;
    }

    public void setTerlambat(int terlambat) {
        this.terlambat = terlambat;
    }

    public void setDenda(double denda) {
        this.denda = denda;
    } 
}
