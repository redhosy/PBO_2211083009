/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho010423;

/**
 *
 * @author septa
 */
public class EntryBukuAlamat{
    private String nama; 
    private String alamat; 
    private String notlp; 
    private String alamatemail; 
    
    private static int BukuAlamatCount; 
   
    public EntryBukuAlamat(){
        BukuAlamatCount++;
    }
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    
    public String getNotlp(){
        return  notlp;
    }
    public void setNotlp(String notlp){
        this. notlp=notlp;
    }
    
    public String getAlamatemail(){
        return  alamatemail;
    }
    public void setAlamatemail(String alamatemail){
        this. alamatemail=alamatemail;
    }
    
    public static int getBukuAlamatCount(){
        return BukuAlamatCount;
    }
    
    public void print( String temp ){ 
        System.out.println("Nama        :" + nama); 
        System.out.println("Alamat      :" + alamat); 
        System.out.println("Notlp       :" + notlp); 
        System.out.println("Alamtemail  :" + alamatemail); 
    }

    void setAlamat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
