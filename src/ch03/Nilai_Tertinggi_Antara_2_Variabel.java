package ch03;

import java.util.Scanner;

public class Nilai_Tertinggi_Antara_2_Variabel {
    public static void main(String[] args){
        Scanner dimas = new Scanner(System.in);

        int x;
        int y;

        System.out.println("Masukkan Nilai Variabel x : ");
        x = dimas.nextInt();

        System.out.println("Masukkan Nilai Variabel y : ");
        y = dimas.nextInt();

        if(x < y){
            System.out.println("Jadi, " + y + " adalah nilai terbesar");
        } else {
            System.out.println("Jadi, " + x + " adalah nilai terbesar");
        }
    }
}