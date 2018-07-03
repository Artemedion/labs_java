import java.util.Scanner;

public class lab4_z4 {
    public static void main(String[] args) {
        String abcUp = "АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String abcLo = abcUp.toLowerCase(); // большое в маленькое
        int len = abcUp.length();
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        String str = "Яусский текст";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = abcUp.indexOf(ch);
            if (idx != -1) {
                System.out.print(abcUp.charAt((idx+K)%len));
                continue;
            }
            else {
                idx = abcLo.indexOf(ch);
                if (idx != -1) {
                    System.out.print(abcLo.charAt((idx + K) % len));
                    continue;
                }
            }
            System.out.print(ch);
        }
    }

}