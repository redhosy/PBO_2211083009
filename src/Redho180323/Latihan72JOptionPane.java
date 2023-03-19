/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho180323;

/**
 *
 * @author septa
 */

import javax.swing.JOptionPane;
public class Latihan72JOptionPane {
    public static void main(String[] args){
        int number[] =new int[10];
        
        //mengunakan JOptionPane
        for(int i=0; i<number.length; i++){
            String input = JOptionPane.showInputDialog("Masukkan nomor ke-" + (i+1));
            number[i] = Integer.parseInt(input);
        }
        
        int max = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Input terbesar adalah: " + max);
    }
}
