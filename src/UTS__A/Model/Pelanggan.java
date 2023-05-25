/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS__A.Model;

/**
 *
 * @author septa
 */
public class Pelanggan {
    private String Kodepelanggan;
    private String Namapelanggan;
    private String JenisPelanggan;
    private String Tglmasuk;
    private String Jammasuk;
    private int Tarif;
    
public Pelanggan(){
}

public Pelanggan(String Kp, String Np, String Js){
    this.Kodepelanggan = Kp;
    this.Namapelanggan = Np;
    this.JenisPelanggan = Js;
    }

public String getKp(){
    return Kodepelanggan;
    }
public void setKp(String Kp){
   this.Kodepelanggan = Kodepelanggan;
    }
public String getNp(){
    return Namapelanggan;
    }
public void setNP(String Np){
     this.Namapelanggan = Namapelanggan;
    }
public String getJs(){
    return JenisPelanggan;
    }
public void setJs(String Js){
    this.JenisPelanggan = JenisPelanggan;
    }
}

