/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprogramming;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tugas2 {
    public static String tampil(String identitas) {
        System.out.print("Identitas "+identitas);
        System.out.println("\nHitung upah maksimal");
        System.out.println("Daftar barang: a(5000/kg), b(7000/kg), c(2000/kg), d(3000/kg), e(10000/kg)");
        return identitas;
       
    }
    public static void main(String[] args) {
        String identitas = "Wahyu Aditya U. / XRPL5 / 41";
        tampil(identitas);
        Scanner abc = new Scanner(System.in);
        System.out.print("Jumlah barang : ");
        int uang = abc.nextInt();
        int berat[] = {7,5,4,3,2};
        String nama[] = {"A","B","C","D","E"};
        int upah[] = {10000,7000,5000,3000,2000};
        int jumlah;
        
        for(int i=0; i<berat.length; i++){
            if(uang >= berat[i]){
                jumlah = uang / berat[i];
                int banyak = jumlah * berat[i];
                uang = uang%berat[i];
                int harga = jumlah * upah[i];
                System.out.println("barang "+nama[i]+  " sejumlah "+jumlah+" buah dengan total berat "+banyak+"kg. bayaran: "+harga);
                
            }
        }
    }
    
}