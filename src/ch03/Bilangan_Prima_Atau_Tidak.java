package ch03;

import java.util.Scanner;

public class Bilangan_Prima_Atau_Tidak {
    public static void main(String[] args) {
        Scanner dimas = new Scanner(System.in);
        
        System.out.printf("Input sebuah bilangan : ");
        int n = dimas.nextInt();
        int b = 0;
        
        for(int a=1;a<=n;a++){
            if(n%a==0)
               b=b+1;
            }
            if(b==2)
               System.out.printf(n+" Adalah Bilangan Prima ");
            else
               System.out.printf(n+" Adalah Bukan Bilangan Prima ");
    }
}