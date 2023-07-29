/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RedoHer.Model;
/**
 *
 * @author septa
 */
public class Warnet {
    private String kodetr;
    private String namapel;
    private String tglmasuk;
    private int jammasuk;
    private int jamkeluar;
    private int lama;
    private int tarif;
    private int diskon;
    private double total;
    
    public Warnet(){
        
    }

    public Warnet(String kodetr, String namapel, String tglmasuk, int jammasuk, int jamkeluar, int lama, int tarif, int diskon, double total) {
        this.kodetr = kodetr;
        this.namapel = namapel;
        this.tglmasuk = tglmasuk;
        this.jammasuk = jammasuk;
        this.jamkeluar = jamkeluar;
        this.lama = lama;
        this.tarif = tarif;
        this.diskon = diskon;
        this.total = total;
    }

    

    public String getKodetr() {
        return kodetr;
    }

    public String getNamapel() {
        return namapel;
    }

    public String getTglmasuk() {
        return tglmasuk;
    }

    public int getJammasuk() {
        return jammasuk;
    }

    public int getJamkeluar() {
        return jamkeluar;
    }

    public int getLama() {
        return lama;
    }

    public int getTarif() {
        return tarif;
    }

    public int getDiskon() {
        return diskon;
    }

    public double getTotal() {
        return total;
    }

    public void setKodetr(String kodetr) {
        this.kodetr = kodetr;
    }

    public void setNamapel(String namapel) {
        this.namapel = namapel;
    }

    public void setTglmasuk(String tglmasuk) {
        this.tglmasuk = tglmasuk;
    }

    public void setJammasuk(int jammasuk) {
        this.jammasuk = jammasuk;
    }

    public void setJamkeluar(int jamkeluar) {
        this.jamkeluar = jamkeluar;
    }

    public void setLama(int jam) {
        lama = jamkeluar - jammasuk ;
    }

    public void setTarif(int tarif) {
         this.tarif = tarif;
    }

    public void setDiskon(int d) {
        if (lama >= 5){
          diskon =(int) (lama * tarif * 0.05);
       }else{
          diskon = 0;
       }
    }

    public void setTotal(double t) {
        total = lama * tarif - diskon;
    }
}
