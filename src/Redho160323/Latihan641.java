/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho160323;

/**
 *
 * @author septa
 */
import java.util.Scanner;
public class Latihan641 {
    //6.5.4 Perpangkatan while loop
    public static void main(String[] args){
 
        Scanner in = new Scanner(System.in);
        System.out.println("Bilangan yang ingin dipangkatkan");
        int a = in.nextInt();
        System.out.println("Pangkat bilangan");
        int b = in.nextInt();
        
        int j = 1;
        int hasil = a;
        while (j<b){
            hasil *= a;
            j++;
            
          System.out.println("Hasil dari "+a+"^"+b+" = " +hasil);
        }
    }
}
