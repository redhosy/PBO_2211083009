/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Redho.Dao;
import java.sql.SQLDataException;
import Redho.Model.*;
import java.util.List;
/**
 *
 * @author septa
 */
public interface MahasiswaDao{
    void insert(Mahasiswa mahasiswa) throws Exception;
    void update(Mahasiswa mahasiswa) throws Exception;
    void delete(Mahasiswa mahasiswa) throws Exception;
    Mahasiswa getMahasiswa (String nim) throws Exception;
    List<Mahasiswa> getAll() throws Exception;
}
