package ch04;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner dimas = new Scanner(System.in);

        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int arrayX;
        boolean benar=false;

        System.out.println("Array : [82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3]");

        System.out.print("Masukkan Nilai Array = ");
        arrayX = dimas.nextInt();

        for(int baris = 0; baris < array.length; baris++) {
            if (array[baris] == arrayX){
                System.out.println("\nNilai Angka Array : " +arrayX + "\nBerada pada baris ke : " +baris);
                benar=true;
            }
        }
        if (benar==false){
            System.out.println("Nilai Angka Array : " +arrayX +" tidak ada dalam array ini.");
        }
    }
}