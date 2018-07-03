
import java.util.Random;
import java.util.Scanner;


public class lab5_z4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(10);
            System.out.print(Integer.toString(arr[i]) + " ");
        }
        System.out.println();

        int[] B = new int[N];
        int j = 0;
        for (int v : arr) {
            if (v % 2 == 0) {
                B[j] = v;
                System.out.print(Integer.toString(B[j++]) + " ");
            }
        }
        System.out.println("\nКоличество элементов нового массива : " + j);
    }
}