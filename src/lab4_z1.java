import java.util.Scanner;

public class lab4_z1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i = 'A'; i < 'A'+ N; i++) {
            System.out.println((char)i);
        }
    }
}