/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho080423;

/**
 *
 * @author septa
 */
public class ExtendStudentRecord extends StudentRecord{
    //latihan 1
   private double KompGrade; 
        public ExtendStudentRecord() {
        super("Ali","Padang");
        System.out.println("Inside Student:Constructor");
    }
        
    public double getKompGrade() {
        return KompGrade;
    }
    
    public void setKompGrade(double kGrade){
        this.KompGrade = kGrade;
    }
    
    @Override
     public double getAvarage() {
        return (getMathGrade() + getEnglishGrade() + getScienceGrade()+ getKompGrade()) /4;
    }
    
}
