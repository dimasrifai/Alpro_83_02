package ch06;

public class Insertion_Sort {
    public static void insertionSort(int[] array) {
        
        for (int i = 1; i < array.length; i++) {
            
            /** Masukkan array[i] kedalam sublist yang disortir pada
            array[0..i-1] sehingga array[0..i] disortir. */
            
            //simpan terlebih dahulu array[i] ke dalam 
            //variabel sementara temp
            int temp = array[i];
            int k;
            
            for (k = i - 1; k >= 0 && array[k] > temp; k--) {
                array[k + 1] = array[k];
                }
            
            // Tetapkan element yang disortir kedalam array[k + 1]
            array[k + 1] = temp;
            
            }
        }
    
    public static void main (String [] args){
        
        //array sebelum insertion sort
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        Insertion_Sort.insertionSort(array);
        
        //for loop untuk menampilkan elemen array
        //setelah insertion sort dilakukan
        for (int i = 0; i < array.length; i++)
          {
          System.out.println("Elemen di index " + i 
                  + " sekarang adalah " + array[i]);
          }
    }
    
}