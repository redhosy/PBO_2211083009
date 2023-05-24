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
public class GajiDaolmpl implements GajiDao {
    List<Gaji> data = new ArrayList<>();

public GajiDaolmpl() {
    KaryawanDao daokaryawan = new KaryawanDaolmpl();
    data.add(new Gaji(daokaryawan.getKaryawan(0),"1","2021"));
    data.add(new Gaji(daokaryawan.getKaryawan(1),"2","2022"));
    data.add(new Gaji(daokaryawan.getKaryawan(2),"3","2023"));
    data.add(new Gaji(daokaryawan.getKaryawan(3),"4","2024"));
    }

    public void save(Gaji gaji){
        data.add(gaji);
    }
    public void update(int idx, Gaji gaji){
        data.set(idx, gaji);
    }
    public void delete(int idx){
        data.remove(idx);
    }

    public Gaji getGaji(int idx){
        return data.get(idx);
    }

    public List<Gaji> getAll(){
        return data;
    }
}