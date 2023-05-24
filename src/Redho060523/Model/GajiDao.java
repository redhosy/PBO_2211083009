/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Redho060523.Model;
import java.util.List;
/**
 *
 * @author septa
 */
public interface GajiDao {
    void save(Gaji gaji);
    void update(int idx, Gaji gaji);
    void delete(int idx);
    Gaji getGaji(int idx);
    List<Gaji> getAll();
}
