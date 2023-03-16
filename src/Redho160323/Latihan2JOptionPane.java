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
public class Latihan2JOptionPane {
    public static void main(String[] args){
        String inputNumber1 = JOptionPane.showInputDialog("Enter number-1: ");
        int number1 = Integer.parseInt( inputNumber1);
        String inputNumber2 = JOptionPane.showInputDialog("Enter number-2: ");
        int number2 = Integer.parseInt( inputNumber2);
        String inputNumber3 = JOptionPane.showInputDialog("Enter number-3: ");
        int number3 = Integer.parseInt( inputNumber3);
        
        int avg =( number1 + number2 + number3)/3;
          
        JOptionPane.showMessageDialog(null, "Rata-rata adalah = "+avg);
        
    }
}
