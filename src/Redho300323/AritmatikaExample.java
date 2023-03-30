/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho300323;

/**
 *
 * @author septa
 */
public class AritmatikaExample {
      public static void main(String[] args) {
    Aritmatika ax = new Aritmatika();
    int hasilTambah = ax.tambah(3, 5);
    System.out.println("Hasil penjumlahan: " + hasilTambah);
    System.out.println("apakah ganjil: " + ax.cekGanjil(7));
    
    int []array=ax.ganjilpertama(5);
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    int []array2=ax.primapertama(5);
        for(int i=0; i<array2.length; i++){
            System.out.print(array2[i]+" ");
        }
  }
}
