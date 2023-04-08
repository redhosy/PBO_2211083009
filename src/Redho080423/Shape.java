/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho080423;

/**
 *
 * @author septa
 */
public abstract class Shape {
    //latihan 2
    public abstract double getArea();
    public abstract String getName();
    
    public static void main(String[] args){
        Circle a = new Circle(15);
        Square b = new Square(10);
        
        System.out.println("Nama objek a :"+ a.getName());
        System.out.println("Luas objek a :"+ a.getArea());
        System.out.println();
        System.out.println("Nama objek b :"+ b.getName());
        System.out.println("Luas objek b :"+ b.getArea());
    }
}
