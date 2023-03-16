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
public class Latihan3JOptionPane {
     public static void main(String[] args){
        String inputNumber1 = JOptionPane.showInputDialog("Enter number-1: ");
        int a = Integer.parseInt( inputNumber1);
        String inputNumber2 = JOptionPane.showInputDialog("Enter number-2: ");
        int b = Integer.parseInt( inputNumber2);
        String inputNumber3 = JOptionPane.showInputDialog("Enter number-3: ");
        int c = Integer.parseInt( inputNumber3);
        
        int max = (a>b)?((a>c)? a:c):((b>c)?b:c);
        
        JOptionPane.showMessageDialog(null, "nilai tertingginya adalah angka = "+max);
     }
}
