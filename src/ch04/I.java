package ch04;

public class I {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int selisih;

        System.out.println("");
        System.out.println("Array : [82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3]");
        System.out.println("");
        for (int i = 0; i < array.length; i++){
            selisih = array[i] - array[i+1];
            System.out.println("Selisih : "+selisih);
        }
    }
}