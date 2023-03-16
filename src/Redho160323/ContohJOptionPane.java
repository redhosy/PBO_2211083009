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
public class ContohJOptionPane {
    public static void main(String[] args){
        String name =" ";
       name = JOptionPane.showInputDialog("Please enter your name:");
         String msg = "Hello " + name + ":v";
         
         JOptionPane.showMessageDialog(null, msg);
    }
}
