package ch04;

public class J {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int selisih;

        System.out.println("");
        System.out.println("Array : [82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3]");
        System.out.println("");
        System.out.println("Selisih Pada Bilangan Genap  :  ");
        for (int i = 0; i < array.length; i++){
            if (array [i] % 2 == 0) {
                selisih = array [i] - array [i+1];
                System.out.println(selisih + " ");
            }
        }
        System.out.println("");
    }
}