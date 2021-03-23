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
public class array2D {
    public static void main(String[] args){
        int [][] angka = {{1,2,3,4},{5,6,3,6},{4,6,7,8},{4,3,5,7}};
        for (int baris = 0; baris < 4; baris++){
            for (int kolom = 0; kolom < 4; kolom++){
            System.out.print(angka[baris][kolom]+"  ");
        }
            System.out.println(" ");
        }
        
    }
}
