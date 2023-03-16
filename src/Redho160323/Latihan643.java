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
public class Latihan643 {
    //6.5.4 Perpangkatan for-do
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Bilangan yang ingin dipangkatkan");
        int a = in.nextInt();
        System.out.println("Pangkat bilangan");
        int b = in.nextInt();
        
         int hasil = a;
         
         for (int j = 1; j < b; j++) {
           hasil *= a;
        }
       System.out.println("Hasil dari "+a+"^"+b+" = " +hasil);
    }
}
