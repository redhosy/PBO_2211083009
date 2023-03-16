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
public class Latihan2BufferedReader {
    public static void main(String[] args){
       BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
       
       int number1;
       int number2;
       int number3;
       int avg ;
       
       try{
        System.out.print("Enter number-1: ");
        number1 = Integer.parseInt(dataIn.readLine());
        System.out.print("Enter number-2: ");
        number2 = Integer.parseInt(dataIn.readLine());
        System.out.print("Enter number-3: ");
        number3= Integer.parseInt(dataIn.readLine());
      
        avg =( number1 + number2 + number3)/3;
       
  
       //cetak variabel
       System.out.println("number1 = "+number1);
       System.out.println("number2 = "+number2);
       System.out.println("number3 = "+number3);
       System.out.println("Rata-rata adalah = "+avg);
       }catch (Exception ex){
       }
    }
}
