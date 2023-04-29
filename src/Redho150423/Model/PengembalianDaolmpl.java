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
public class PengembalianDaolmpl implements PengembalianDao{
    List<Pengembalian> data = new ArrayList<>();
    
    public PengembalianDaolmpl(){
        data.add(new Pengembalian("",""));
    }
    public void save(Pengembalian pengembalian){
        data.add(pengembalian);
    }
    public void update(int idx,Pengembalian pengembalian){
        data.set(idx, pengembalian);
    }
    public void delete(int idx){
        data.remove(idx);
    }
    
    public Pengembalian getPengembalian(int idx){
        return data.get(idx);
    }
    public List<Pengembalian> getAll(){
        return data;
    }  
}
