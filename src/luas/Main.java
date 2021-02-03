
package luas;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int pilihan;
        System.out.println("Selamat datang di program menghitung");
        System.out.println("Berikut pilihannya :");
        System.out.println("1. Luas lingkaran");
        System.out.println("2. Luas Persegi");
        System.out.print("Masukan pilihan anda :  ");
        pilihan=input.nextInt();
        
        Lingkaran oke=new Lingkaran();
        Persegi siap=new Persegi();
        switch(pilihan){
            case 1 :
                oke.hitung();
            break;
            case 2 :
                siap.hitung();
            break;
        }
        
    }
    
}
