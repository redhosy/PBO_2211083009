   /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package RedoHer.Dao;
import java.sql.SQLDataException;
import RedoHer.Model.*;
import java.util.List;
/**
 *
 * @author septa
 */
public interface WarnetDao {
    void insert (Warnet warnet ) throws Exception;
    void update (Warnet warnet) throws Exception;
    void delete (Warnet warnet ) throws Exception;
    Warnet getWarnet(String kodetr)throws Exception;
    List<Warnet> getAll() throws Exception;
}
