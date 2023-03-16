/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho160323;

/**
 *
 * @author septa
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
    
public class Latihan611 {
    //6.5.1 Nilai 
    public static void main(String[] args)throws IOException{
    BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
    int nilai1, nilai2, nilai3;
    
    System.out.print("Masukkan nilai ke 1: ");
    nilai1 = Integer.parseInt(dataIn.readLine());
    System.out.print("Masukkan nilai ke 2: ");
    nilai2 = Integer.parseInt(dataIn.readLine());
    System.out.print("Masukkan nilai ke 3: ");
    nilai3 = Integer.parseInt(dataIn.readLine());
   
    double rata = (double)(nilai1+nilai2+nilai3)/3;
    System.out.println("rata-rata nilai ujian adalah : " +rata);
    
     if (rata >= 60) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }
    }
}
