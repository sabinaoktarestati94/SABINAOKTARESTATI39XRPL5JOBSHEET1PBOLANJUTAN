/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Latihan4 {
    public static void main(String[] args){
        Scanner masukan = new Scanner (System.in);
        int bil, hasil;
        System.out.print("Masukkan suatu bilangan: ");
        bil = masukan.nextInt();
        hasil = faktorial(bil);
        System.out.println("Nilai faktorial "+bil +" adalah "+ hasil);
    }
    private static int faktorial(int a){
        if (a==1){
        return 1;
    }
        else 
        return (a*faktorial(a-1));
    }
}


