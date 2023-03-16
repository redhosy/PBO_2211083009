/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho160323;

/**
 *
 * @author septa
 */
import javax.swing.JOptionPane;
public class Latihan612 {
    //6.5.1 Nilai 
    public static void main(String[] args){
        
        String inputNilai1 = JOptionPane.showInputDialog("Masukkan nilai ke 1: ");
        int nilai1 = Integer.parseInt(inputNilai1);

        String inputNilai2 = JOptionPane.showInputDialog("Masukkan nilai ke 2: ");
        int nilai2 = Integer.parseInt(inputNilai2);

        String inputNilai3= JOptionPane.showInputDialog("Masukkan nilai ke 3: ");
        int nilai3 = Integer.parseInt(inputNilai3);
        
        int Nilai1, Nilai2, Nilai3;
        
         double rata = (double)(nilai1+nilai2+nilai3)/3;
         System.out.println("rata-rata nilai ujian adalah : " +rata);
         
          if (rata >= 60) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }
    }
}
