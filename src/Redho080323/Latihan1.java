/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho080323;

/**
 *
 * @author septa
 */

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

public class Latihan1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter word1: ");
        String word1 = reader.readLine();
        
        System.out.print("Enter word2: ");
        String word2 = reader.readLine();
        
        System.out.print("Enter word3: ");
        String word3 = reader.readLine();
        
        System.out.println(word1 + " " + word2 + " " + word3);
    }
}


