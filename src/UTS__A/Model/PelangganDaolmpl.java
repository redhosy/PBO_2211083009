/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS__A.Model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author septa
 */
public class PelangganDaolmpl implements PelangganDao{
    List<Pelanggan> data = new ArrayList<>();
    
    public PelangganDaolmpl(){
        data.add(new Pelanggan("123","Ali","VIP"));
        data.add(new Pelanggan("321","Asep","GOLD"));
       
    }
    
    public void save(Pelanggan pelanggan){
        data.add(pelanggan);
    }
    public void update(int index, Pelanggan pelanggan){
        data.set(index, pelanggan);
    }
    public void delete(int index){
        data.remove(index);
    }
    
    public Pelanggan getPelanggan(int index){
        return data.get(index);
    }
    public List<Pelanggan> getAll(){
        return data;
    }  
}


