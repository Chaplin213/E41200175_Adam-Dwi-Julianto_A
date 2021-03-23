/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

public class sintaks{
	public static void main(String[] args){
		String belanjaan;
		int total,input1,input2,input3,input4,input5;
		Scanner scan = new Scanner(System.in);
		System.out.println("---------------------------------------------");
		System.out.println("\tKharisma Agung Plaza < KAP >");
		System.out.println("\t  Promo Belanja Berhadiah");
		System.out.println("      Khusus Pembelian 5 Barang Pertama");
		System.out.println("      Dengan Harga minimum Rp 10.000,00");
                
		System.out.println("---------------------------------------------");
		System.out.print("Masukkan nama pembeli : ");
		String Masukkan = scan.nextLine();
                System.out.println();
		System.out.print("Masukkan harga barang ke-1 : ");
		input1 = scan.nextInt();
		System.out.print("Masukkan harga barang ke-2 : ");
		input2 = scan.nextInt();
		System.out.print("Masukkan harga barang ke-3 : ");
		input3 = scan.nextInt();
		System.out.print("Masukkan harga barang ke-4 : ");
		input4 = scan.nextInt();
		System.out.print("Masukkan harga barang ke-5 : ");
		input5 = scan.nextInt();

		total = input1+input2+input3+input4+input5;
		System.out.println("Total harga pembelian atas nama " +Masukkan +" adalah Rp " +total);

		System.out.println("Selamat....");
		System.out.println("Anda mendapat hadiah 1 buah mug cantik");
                System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println("\t         Terima Kasih");
		System.out.println("  Anda sudah belanja di Kharisma Agung Plaza");
		
}
}