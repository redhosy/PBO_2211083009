/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho060523.Model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author septa
 */
public class KaryawanDaolmpl implements KaryawanDao {
    List<Karyawan> data = new ArrayList<>();
    
    public KaryawanDaolmpl(){
        data.add(new Karyawan("0012023","asep","padang","single",1,"staff",0));
        data.add(new Karyawan("0022022","rini","padang","nikah",1,"staff",2));
        data.add(new Karyawan("0032021","agus","padang pariaman","nikah",2,"staff manager",2));
        data.add(new Karyawan("0042020","meri","padang panjang","nikah",3,"bos",3));
        data.add(new Karyawan("0052022","dahlan","padang ","nikah",4,"bos",4));
         
    }
    public void save(Karyawan karyawan){
        data.add(karyawan);
    }
    public void update(int idx, Karyawan karyawan){
        data.set( idx, karyawan);
    }
    public void delete(int idx){
        data.remove(idx);
    }
    public Karyawan getKaryawan(int idx){
        return data.get(idx);
    }
    public List<Karyawan> getAll(){
        return data;
    }  
}

