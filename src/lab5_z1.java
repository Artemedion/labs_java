import java.util.Random;
import java.util.Scanner;

public class lab5_z1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите N: ");
        int N = scanner.nextInt();

        int[] arr = new int[N]; //выделение памяти под массив
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) { //заполняем массив рандомными числами от 0 до 9
            arr[i] = rand.nextInt(10);
            System.out.print(Integer.toString(arr[i]) + " ");
        }
        System.out.println("");
        System.out.print("Введите K: ");
        int K = scanner.nextInt();
        System.out.print("Введите L: ");
        int L = scanner.nextInt();

        int sum = 0;
        for(int i = K; i < L+1; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}