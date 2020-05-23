package ch04;

public class C {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("");
        System.out.println("Array : [82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3]");
        System.out.println("");
        System.out.print("Bilangan Ganjil Dari Array Diatas : ");
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2!= 0){
                System.out.print(array[i] + " ");
            }
        }      
        System.out.println("");
    }
}