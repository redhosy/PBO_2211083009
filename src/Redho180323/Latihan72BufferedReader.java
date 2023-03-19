/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho180323;

import javax.swing.JOptionPane;

/**
 *
 * @author septa
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Latihan72BufferedReader {
    public static void main(String[] args) throws IOException{
        int number[] =new int[10];
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 
        for(int i=0; i<number.length; i++){
          System.out.print("Masukkan nomor ke-"+ (i+1) + ":");
            String input =reader.readLine();
            number[i] = Integer.parseInt(input);
        }
        
        int max = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
       System.out.println("Input terbesar adalah: " + max);
    }
}


