/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho060523.Model;

/**
 *
 * @author septa
 */
public class Karyawan extends People {
    private String nip;
    private int golongan;
    private String jabatan;
    private int jumlahanak;
    
     public Karyawan(){
    }
    public Karyawan (String nip, String nama, String alamat, String statusNikah,  int golongan, String jabatan, int jumlahanak){
        super( nama,alamat,statusNikah);
        this.nip = nip;
        this.golongan = golongan;
        this.jabatan = jabatan;
        this.jumlahanak = jumlahanak;
    }
    public String getnip(){
        return nip;
    }
    public int getgolongan(){
        return golongan;
    }
    public String getjabatan(){
        return jabatan;
    }
    public int getjumlahanak(){
        return jumlahanak;
    }
    
    public void setnip(String nip){
        this.nip = nip;
    }
    public void setgolongan(int golongan){
       this.golongan = golongan;
    }
    public void setjabatan(String jabatan){
        this.jabatan = jabatan;
    }
    public void setjumlahanak(int jumlahanak){
        this.jumlahanak = jumlahanak;
    }
}
