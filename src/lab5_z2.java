import java.util.*;

public class lab5_z2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(10);
            System.out.print(Integer.toString(arr[i]) + " ");
        }
        System.out.println("");
        Set<Integer> setInt = new LinkedHashSet<>(); //создаем сет
        for (int i : arr) { //добавляем все элемент из массива в сет
            setInt.add(i);
        }
        System.out.println(setInt);
    }
}