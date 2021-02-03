
package luas;

import java.util.Scanner;


public class Persegi {
    Scanner input=new Scanner (System.in);
    void hitung(){
    int s;
    int rumus;
        System.out.print("Masukan nilai sisi :");
        s=input.nextInt();
        rumus=s*s;
        System.out.println("Luas persegi adalah :"+rumus);
}
}
