/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Redho.Dao;

import Redho.Model.*;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author septa
 */
public interface PeminjamanDao {
    void insert (Peminjaman peminjaman)throws SQLException;
    void update (Peminjaman peminjaman)throws SQLException;
    void delete (Peminjaman peminjaman)throws SQLException;
    Peminjaman getPeminjaman(String kodeAnggota, String Kodebuku, String Tglpinjam)throws SQLException, Exception;
    List<Peminjaman> getAll() throws SQLException;
    
}
