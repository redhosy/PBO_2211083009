/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho.Model;

/**
 *
 * @author septa
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private int usia;
    private double hitungukt;
    
    public Mahasiswa(){
        
    }

    public Mahasiswa(String nim, String nama, int usia,  double hitungukt) {
        this.nim = nim;
        this.nama = nama;
        this.usia = usia;
        this.hitungukt = hitungukt;
    }


    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public double getHitungukt() {
        return hitungukt;
    }

    
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void setHitungukt(int usia ) {
        if(usia < 18){
            hitungukt = 500000;
        }else if(usia >= 18 && usia <= 21){
            hitungukt = 800000;
        }else{
            hitungukt = 1200000;
        }
    }

}
