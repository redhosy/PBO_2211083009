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

public class Latihan1JOptionPane {
    public static void main(String[] args) {
        String inputNilai1 = JOptionPane.showInputDialog("Enter nilai A: ");
        int nilai1 = Integer.parseInt(inputNilai1);

        String inputNilai2 = JOptionPane.showInputDialog("Enter nilai B: ");
        int nilai2 = Integer.parseInt(inputNilai2);

        String inputD = JOptionPane.showInputDialog("Enter nilai d (true/false): ");
        boolean d = Boolean.parseBoolean(inputD);

        int nilai3 = nilai1 + nilai2;

        JOptionPane.showMessageDialog(null, "Hasil nilai C: " + nilai3);
        JOptionPane.showMessageDialog(null, "Hasil nilai D: " + d);
    }
}
