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
public interface PeminjamanDao {
    void pinjam (Peminjaman peminjaman)throws Exception;
    void update (Peminjaman peminjaman)throws Exception;
    void delete (Peminjaman peminjaman)throws Exception;
    Peminjaman getPeminjaman(String Kodepeminjaman)throws Exception;
    List<Peminjaman> getAll() throws Exception;
    
}
