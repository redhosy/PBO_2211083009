/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Redho070323;

/**
 *
 * @author LABSIKOMP03
 */
public class Latihan3 {
    public static void main(String[] args){
        int a = 10;
        int b = 23;
        int c = 5;
        
        int max = (a>b)?((a>c)? a:c):((b>c)?b:c);
        
        //cetak variabel
        System.out.println("number1 = "+a);
        System.out.println("number2 = "+b);
        System.out.println("number3 = "+c);
        System.out.println("nilai tertingginya adlah angka = "+max);
    }
}
