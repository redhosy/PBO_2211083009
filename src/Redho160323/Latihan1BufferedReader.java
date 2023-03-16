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

public class Latihan1BufferedReader {
     public static void main(String[] args){
     BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
     int nilai1;
     int nilai2;
     boolean d;
     
     try{
        System.out.print("Enter nilai A: ");
        nilai1 = Integer.parseInt(dataIn.readLine());
        System.out.print("Enter nilai B: ");
        nilai2 = Integer.parseInt(dataIn.readLine());
        System.out.print("Enter nilai d: ");
        d = Boolean.parseBoolean(dataIn.readLine());
        
        int nilai3 = nilai1 + nilai2;
        System.out.println("Hasil nilai C :" + nilai3);
        System.out.println("Hasil nilai D :" + d);
     }catch (Exception ex){
     }
   }
}
        
       
