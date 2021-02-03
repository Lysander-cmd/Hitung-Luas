
package luas;

import java.util.Scanner;


public class Lingkaran {
    Scanner input = new Scanner(System.in);
    void hitung(){
        int r;
        double rumus;
        System.out.print("Masukan nilai jari jari :");
        r=input.nextInt();
        rumus = 3.14*r*r;
        System.out.println("Luas lingkaran :"+rumus);
    }
}
