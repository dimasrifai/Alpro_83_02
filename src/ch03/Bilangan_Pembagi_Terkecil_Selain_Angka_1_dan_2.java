package ch03;

import java.util.Scanner;

public class Bilangan_Pembagi_Terkecil_Selain_Angka_1_dan_2 {
    public static void main(String[] args) {
        int bilangan;

        Scanner dimas = new Scanner(System.in);
  
        System.out.print("Masukkan bilangan = ");
        bilangan = dimas.nextInt();

        for (int p=3; p<bilangan; p++){
            if (bilangan%p==0){
                System.out.println(p);
                break;
            }
        }
    }
}