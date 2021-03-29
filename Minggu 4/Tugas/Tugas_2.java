/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ADAM
 */
public class Tugas_2 {
    public static void main(String[] args){
         int i = 1; 
         System.out.println("\t Do_While");
         System.out.println("Bilangan kelipatan 2 (1-100)");
         System.out.println("============================");
         do{ 
            System.out.print(" "+  i + " "); 
            
            i = i * 2;   
            
            }while (i <= 100);
           System.out.println("\t");
         
     }
}
