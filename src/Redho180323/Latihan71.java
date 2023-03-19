/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho180323;

/**
 *
 * @author septa
 */
public class Latihan71 {
    public static void main(String[] args){
        String day[]=new String[]{"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};
           
        //while-loop
         int i = 0;
            while(i < day.length){
              System.out.println(day[i]);
                i++;
        }
        
         //do-while-loop
         int j=0;
         do{
             System.out.println(day[j]);
             j++;
         }  while(j < day.length);
         
         //for-loop
         for(int k=0; k<day.length; k++){
             System.out.println(day[k]);
         }
    }
}
