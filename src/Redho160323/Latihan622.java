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
public class Latihan622{
    //6.5.2Membaca Bilangan statement switch
   public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan sebuah angka antara 1-10: ");
        int num = input.nextInt();
        
        switch(num) {
        case 1:
             System.out.println("Satu");
             break;
        case 2:
             System.out.println("Dua");
             break;
        case 3:
             System.out.println("Tiga");
             break;
        case 4:
             System.out.println("Empat");
             break;
        case 5:
             System.out.println("Lima");
             break;
        case 6:
             System.out.println("Enam");
             break;
        case 7:
             System.out.println("Tujuh");
             break;
        case 8:
             System.out.println("Delapan");
             break;
        case 9:
             System.out.println("Sembilan");
             break;
        case 10:
             System.out.println("Sepuluh");
         
        default:
             System.out.println("Invalid Number!");
        }
    }
}
