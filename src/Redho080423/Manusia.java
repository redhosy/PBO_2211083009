/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho080423;

/**
 *
 * @author septa
 */
public class Manusia extends LivingThing{
    public void Berjalan(){
    System.out.println("Manusia berjalan");
    }
    
    public static void main(String[] args){
       Kuda k = new Kuda();
        k.bernapas();
        k.Makan();
        k.Berjalan();
    }
}
