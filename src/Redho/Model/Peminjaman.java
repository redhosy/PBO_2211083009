/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho.Model;

/**
 *
 * @author septa
 */
public class Peminjaman {
    private String  kodeAnggota;
    private String  Kodepeminjaman;
    private String Kodebuku;
    private String tglpinjam;
    private String tglkembali;
    
    public Peminjaman(){}
    public Peminjaman(String Kodepeminjaman, String kodeAnggota,String Kodebuku, String tglpinjam, String tglkembali) {
        this.kodeAnggota = kodeAnggota;
        this.Kodepeminjaman = Kodepeminjaman;
        this.Kodebuku = Kodebuku;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
    }

    public String getKodepeminjaman() {
        return Kodepeminjaman;
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
        return tglkembali;
    }

    public void setKodepeminjaman(String Kodepeminjaman) {
        this.Kodepeminjaman = Kodepeminjaman;
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
}
