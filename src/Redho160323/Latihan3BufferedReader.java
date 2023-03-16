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
public class Latihan3BufferedReader {
   public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int a;
        int b;
        int c;
         
        try{
        
        System.out.print("Enter number-1: ");
        a = Integer.parseInt(dataIn.readLine());
        System.out.print("Enter number-2: ");
        b = Integer.parseInt(dataIn.readLine());
        System.out.print("Enter number-3: ");
        c= Integer.parseInt(dataIn.readLine());  
            
            
            
            
        int max = (a>b)?((a>c)? a:c):((b>c)?b:c);
        
        //cetak variabel
        System.out.println("number1 = "+a);
        System.out.println("number2 = "+b);
        System.out.println("number3 = "+c);
        System.out.println("nilai tertingginya adalah angka = "+max);
         }catch (Exception ex){
             
      }
   } 
}
