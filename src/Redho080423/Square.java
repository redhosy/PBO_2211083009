/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho080423;

/**
 *
 * @author septa
 */
public class Square {
    public int side;
    
    public Square(int side) {
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }
    public String getName() {
        return "Persegi";
    }      
}
