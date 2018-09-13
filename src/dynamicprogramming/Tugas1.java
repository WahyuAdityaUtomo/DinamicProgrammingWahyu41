/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprogramming;


/**
 *
 * @author User
 */
public class Tugas1 {
    public static void main(String[] args) {
        int uang = 19550;
        int pecahan [] = new int[] {5000,2000,1000,500};
        int jumlah;
        
        for (int i=0; i<pecahan.length; i++){
        if(uang >= pecahan[i]){
            jumlah = uang / pecahan[i];
            uang = uang%pecahan[i];
            System.out.println(" pecahan " +pecahan[i]+ " sebanyak " +jumlah+ " keping ");
        }
    }
    }
}
