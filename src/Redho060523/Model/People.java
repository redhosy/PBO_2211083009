/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho060523.Model;

/**
 *
 * @author septa
 */
public class People{
    protected String nama;
    protected String alamat;
    protected String statusNikah;
    
    public People(){
    }
    public People (String nama, String alamat, String statusNikah){
        this.nama = nama;
        this.alamat = alamat;
        this.statusNikah = statusNikah;
    }
    
    public String getnama(){
        return nama;
    }
    public String getalamat(){
        return alamat;
    }
    public String getstatusNikah(){
        return statusNikah;
    }
    
    
    public void setnama(String nama){
        this.nama = nama;
    }
    public void setalamat(String alamat){
        this.alamat = alamat;
    }
    public void setstatusnikah(String statusNikah){
        this.statusNikah = statusNikah;
    }
}
