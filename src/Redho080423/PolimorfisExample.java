/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho080423;

/**
 *
 * @author septa
 */
public class PolimorfisExample {
    public static void main(String[] args){
        Person ref;
        Student Student = new Student();
        Employee emp = new Employee();
        Student.setName("Budi");
        Student.setAddress("Padang");
        
        emp.setName("Doni");
        emp.setAddress("BukitTinggi");
        
        printInformation(Student);
        printInformation(emp);
        
        /*ref = Student;
        String temp =ref.getName();
        System.out.println(temp);
        
        ref = emp;
        String temp1 =ref.getName();
        System.out.println(temp1);*/
    }
    public static void printInformation(Person p){
        if ( p instanceof Student){
            System.out.println("Nama    Student:"+p.getName());
            System.out.println("Alamat   Student:"+p.getAddress());
        }else if(p instanceof Employee){
            System.out.println("Nama    Student:"+p.getName());
            System.out.println("Alamat   Student:"+p.getAddress());
        }
    }
}
