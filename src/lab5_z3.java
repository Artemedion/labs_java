import java.util.Random;
import java.util.Scanner;


public class lab5_z3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        float[] arr = new float[N];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -10 + rand.nextFloat() * 20;
            System.out.print(Float.toString(arr[i]) + " ");
        }
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0.0) {
                idx = i;
                break;
            }
        }
        float sum = 0;
        if (idx != -1) {
            for (int i = idx; i < arr.length; i++) {
                sum += arr[i];
            }
        }
        System.out.println("\nСумма после первого положительного: " + sum);
    }
}