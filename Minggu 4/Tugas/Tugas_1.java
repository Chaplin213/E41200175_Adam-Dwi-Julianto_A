/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
import javax.swing.JOptionPane;
import javax.swing.JoptionPane;


/**
 *
 * @author ADAM
 */
public class Tugas_1 {
    public static void main(String[]  args){
    String A = JOptionPane.showInputDialog("Masukkan Nilai Awal) = ");
    String B = JOptionPane.showInputDialog("Masukkan Nilai Akhir) = ");
    int genap = Integer.parseInt(A);
    int genap1 = Integer.parseInt(B);
   
       for(int i=genap; i<=genap1;i++)
       if (i % 2 == 0){
   System.out.print(i + " ");
    }
    }
}
