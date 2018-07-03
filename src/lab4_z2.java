import java.util.Scanner;

public class lab4_z2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // сканер позволяет осуществлять ввод с клавы
        String str = scanner.nextLine(); // инициализируем строку пользовательским вводом
        int idx1 = str.indexOf(" "); //ищет индекс символа " "
        int idx2 = str.indexOf(" ", idx1+1);
        if (idx2 == -1){
            System.out.println("Строка не содержит второй пробел");
            return; //выход из программы если нет второго пробела
        }
        System.out.println(str.substring(idx1+1, idx2));
    }
}