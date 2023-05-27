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
public class WarnetDaolmpl implements WarnetDao{
     List<Warnet> data = new ArrayList<>();
    
    public WarnetDaolmpl(){
        PelangganDao pelanggandao = new PelangganDaolmpl();
        data.add(new Warnet(pelanggandao.getPelanggan(0),"9/9/2023","9:00","10:00"));
        data.add(new Warnet(pelanggandao.getPelanggan(1),"9/9/2023","11:00","12:00"));
    }
    
    public void save(Warnet warnet){
        data.add(warnet);
    }
    public void update(int index, Warnet warnet){
        data.set(index, warnet);
    }
    public void delete(int index){
        data.remove(index);
    }
    
    public Warnet getWarnet(int index){
        return data.get(index);
    }
    public List<Warnet> getAll(){
        return data;
    }  
}
