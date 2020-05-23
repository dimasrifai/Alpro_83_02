package ch05;

import java.util.Scanner;

public class Euclidean {
    public long gcd(long m, long n) {
        if (m % n == 0)
            return n;
        return gcd(n, m % n);
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Euclidean Algorithm Test\n");
    
        Euclidean eg = new Euclidean();
 
        System.out.println("Masukkan Kedua Bilangan : \n");
        long n1 = scan.nextLong();
        long n2 = scan.nextLong();
        long gcd = eg.gcd(n1, n2);
        System.out.println("\nEuclidean dari "+ n1 +" and "+ n2 +" = "+ gcd);
    }
}