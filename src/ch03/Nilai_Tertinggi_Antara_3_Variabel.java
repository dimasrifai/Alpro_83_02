package ch03;

import java.util.Scanner;
 
public class Nilai_Tertinggi_Antara_3_Variabel {
    public static void main(String[] args) {
    int x, y, z, terbesar;
    Scanner dimas = new Scanner(System.in);
  
    System.out.print("Masukkan bilangan x = ");
    x = dimas.nextInt();
  
    System.out.print("Masukkan bilangan y = ");
    y = dimas.nextInt();
  
    System.out.print("Masukkan bilangan z = ");
    z = dimas.nextInt();
  
    if(x>y && x>z){
    terbesar = x;
    }else{
    if(y>z){
    terbesar = y;
    }else{
    terbesar = z;
    }
    }
  
    System.out.println("Bilangan terbesar adalah "+terbesar); 
    } 
}