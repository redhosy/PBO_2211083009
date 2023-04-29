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
    
   public Pengembalian(String tglKembali,String dkbli){
       this.dikembalikan = dkbli;
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       LocalDate tenggat = LocalDate.parse(tglKembali, formatter);
       LocalDate tglkirim = LocalDate.parse(dikembalikan, formatter);
      
       terlambat = 0;
       if(tglkirim.isAfter(tenggat)){
           terlambat = tglkirim.compareTo(tenggat);
       }
       
       denda = (double)terlambat*1000;
   }
    public String getdikembalikan(){
        return dikembalikan;
    }
    public int getterlambat(){
        return terlambat;
    }
    public double getdenda(){
        return denda;
    }
    
    public void setdikembalikan(String dkbli){
        this.dikembalikan = dkbli;
    }
    public void setterlambat(int terlambat){
        this.terlambat = terlambat;
    }
    public void denda(double denda){
        this.denda = denda;
    }
}
