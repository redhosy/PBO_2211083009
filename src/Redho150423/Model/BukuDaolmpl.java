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
public class BukuDaolmpl implements BukuDao{
 List<Buku> data = new ArrayList<>();
    public BukuDaolmpl(){
        data.add(new Buku("001","Binatangisme","George Orwell","Gading","1984"));
        data.add(new Buku("002","How to be Free","Epiktetos","Gramedia","2014"));
    }
    public void save(Buku buku){
        data.add(buku);
    }
    public void update(int idx, Buku buku){
        data.set(idx, buku);
    }
    public void delete(int idx){
        data.remove(idx);
    }
    public Buku getBuku(int idx){
        return data.get(idx);
    }
    public List<Buku> getAll(){
        return data;
    } 
}
