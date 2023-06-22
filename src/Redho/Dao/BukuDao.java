/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Redho.Dao;

import Redho.Model.*;
import java.util.List;

/**
 *
 * @author septa
 */
public interface BukuDao {
    void insert (Buku buku) throws Exception;
    void update (Buku buku) throws Exception;
    void delete (Buku buku) throws Exception;
    Buku getBuku(String Kodebuku)throws Exception;
    List<Buku> getAll() throws Exception;
}
