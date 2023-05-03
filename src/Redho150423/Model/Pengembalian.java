/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho150423.Model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author septa
 */
public class Pengembalian {
    private String dikembalikan;
    private int terlambat;
    private double denda;
    private String telat;
    private String sanksi;
   
    public Pengembalian(){
    }
   public Pengembalian(String tglKembali,String dkbli){
       try{
       this.dikembalikan = dkbli;
       
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       LocalDate tenggat = LocalDate.parse(tglKembali, formatter);
       LocalDate tglkirim = LocalDate.parse(dikembalikan, formatter);
      
       terlambat = 0;
       if(tglkirim.isAfter(tenggat)){
           terlambat = tglkirim.compareTo(tenggat);
       }
       
       
       denda = (double)terlambat*1000;
       
       this.telat = ""+terlambat;
       this.sanksi = ""+terlambat;
       }catch(Exception e){
           this.dikembalikan = "";
           this.telat = "";
           this.sanksi = "";
           this.terlambat = -1;
           this.denda = -1;
       }
   }
    public String getdikembalikan(){
        return dikembalikan;
    }
    public String getterlambat(){
        return telat;
    }
    public String getdenda(){
        return sanksi;
    }
    
    public void setDikembalikan(String dkbli){
        this.dikembalikan = dkbli;
    }
    public void setterlambat(String tglKembali){
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate tenggat = LocalDate.parse(tglKembali, formatter);
            LocalDate tglkirim = LocalDate.parse(dikembalikan, formatter);

            terlambat = 0;
            if(tglkirim.isAfter(tenggat)){
                terlambat = tglkirim.compareTo(tenggat);
            }
            this.telat = ""+terlambat;
        }catch(Exception e){
            this.telat = "";
            this.terlambat = -1;
        }
    }
    public void setdenda(){
        if(terlambat == -1){
            this.denda = -1;
            this.sanksi = "";
        }else{
            this.denda = (double)terlambat*1000;
            this.sanksi = ""+denda;
        }
    }
}
