/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho150423.Model;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author septa
 */
public class PeminjamanDaolmpl implements PeminjamanDao {
       List<Peminjaman> data = new ArrayList<>();
    
    public PeminjamanDaolmpl(){
        data.add(new Peminjaman("2211082002","Deni","002","08/03/2023","15/03/2023"));
        data.add(new Peminjaman("2211082003","Ani","003","10/03/2023","17/03/2023"));
    }
    
      public void save(Peminjaman peminjaman){
        data.add(peminjaman);
    }
    public void update(int index, Peminjaman peminjaman){
        data.set(index, peminjaman);
    }
    public void delete(int index){
        data.remove(index);
    }
    
    public Peminjaman getPeminjaman(int index){
        return data.get(index);
    }
    public List<Peminjaman> getAll(){
        return data;
    }  
}

