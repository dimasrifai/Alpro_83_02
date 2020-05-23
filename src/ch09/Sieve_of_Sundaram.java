package ch09;

import java.util.Scanner;
 
/** Class SieveOfSundaram **/
public class  Sieve_of_Sundaram{
    /** Function to calculate all primes less than n **/
    private boolean[] calcPrimes(int limit)
    {
        int n = limit/2;
        /** initialize the sieve **/
        boolean[] prime = new boolean[limit];        
 
        for (int i = 1; i < n; i++)
            for (int j = i; j <= (n - i) / (2 * i + 1); j++)
                prime[i + j + 2 * i * j] = true;
 
        return prime;
    }
    /** Function to get all primes **/
    public void getPrimes(int N)
    {
        boolean[] primes = calcPrimes(N);
        display(primes);
    }
    /** Function to display all primes **/
    public void display(boolean[] primes)
    {
        System.out.print("\nPrimes = 2 3 ");
        for (int i = 2; i < primes.length/2; i++)
            if (!primes[i])
                System.out.print((2 * i + 1) +" ");
        System.out.println();
    }
    public static void main (String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sieve Of Sundaram Prime Algorithm Test\n");
        /** Make an object of SieveOfSundaram class **/
        Sieve_of_Sundaram sos = new  Sieve_of_Sundaram();
        /** Accept n **/
        System.out.println("Enter number to find all primes less than the number\n");
        int n = scan.nextInt();
        sos.getPrimes(n);        
    }
}