package ch04;

public class E {
    public static void main(String[] args) {
        int i = 0;
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("");
        System.out.println("Array : [82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3]");
        System.out.println("");
        System.out.println("Angka−angka yang memiliki angka 2 di dalam array : ");
        System.out.println("");
        while(i <= array.length){
            if (array[i] % 2 == 0){
                if (array[i] > 3 && array[i] != 38 && array[i] != 48 && array[i] != 8){
                    System.out.println(array[i]);
                }
            }
            if (i == array.length)
                break;
                i = i + 1;
        }
        System.out.println("");
    }
}