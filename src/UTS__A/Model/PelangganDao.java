/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package UTS__A.Model;
import java.util.List;
/**
 *
 * @author septa
 */
public interface PelangganDao {
    void save(Pelanggan Pelanggan);
    void update(int index, Pelanggan Pelanggan);
    void delete(int index);
    Pelanggan getPelanggan(int index);
    List<Pelanggan> getAll();
}
