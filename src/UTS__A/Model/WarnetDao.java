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
public interface WarnetDao {
    void save(Warnet warnet);
    void update(int index, Warnet warnet);
    void delete(int index);
    Warnet getWarnet(int index);
    List<Warnet> getAll();
}
