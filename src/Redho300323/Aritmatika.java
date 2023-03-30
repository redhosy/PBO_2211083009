/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho300323;

/**
 *
 * @author septa
 */
public class Aritmatika {
    
   public int tambah(int a, int b) {
    return a + b;
  }
  
  public boolean cekGanjil(int a) {
    return a % 2 == 1;
  }
  
 public int[] ganjilpertama(int n) {
    int[] ganjilArray = new int[n];
    int ganjil = 0;
    for (int i = 1; i < 2*n; i++) {
        if(cekGanjil(i)){
            ganjilArray[ganjil++] = i;
            
        }
    }
    return ganjilArray;
  }
    public int[] primapertama(int n) {
    int[] primaArray = new int[n];
    int prima = 0;
    int i = 1;
    while (prima < n) {
        if(cekPrima(i)){
            primaArray[prima++] = i;
        }
        i++;
    }
    return primaArray;
  }
    public boolean cekPrima(int a) {
    int f = 0;
    for(int i = 1; i<=a; i++){
        if(a % i == 0){
            f++;
        }
    }
    return (f==2);
  }
}




  

  

