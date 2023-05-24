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
public interface KaryawanDao {
    void save(Karyawan karyawan);
    void update(int idx, Karyawan karyawan);
    void delete(int idx);
    Karyawan getKaryawan(int idx);
    List<Karyawan> getAll();
}
