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
public interface PengembalianDao {
    void insert(Pengembalian pengembalian) throws SQLException;
    void update(Pengembalian pengembalian) throws SQLException;
    void delete(Pengembalian pengembalian) throws SQLException;
    Pengembalian getPengembalian(String kodeAnggota)throws SQLException;
    List<Pengembalian> getAll()throws SQLException;
}
