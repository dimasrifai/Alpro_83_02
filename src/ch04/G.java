package ch04;

public class G {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("");
        System.out.println("Array : [82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3]");
        System.out.println("");
        System.out.print("Bilangan Kelipatan 5 Dari Array Diatas Adalah : ");      
        System.out.println("");

        for (int i = 0; i < array.length; i++){
            if (array[i] % 5 == 0){
                System.out.println(array[i] + " ");
            }
        }
    }
    
}