public class lab4_z3 {
    public static void main(String[] args) {
        String str = " Мама мыла раму";
        str = str.trim(); //очищает пробелы в концпе и в начале
        String[] split = str.split(" +"); //разбивает по одному или больше пробелу(регулярное выражение)

        for (int i = split.length-1; i >= 0; i--) {
            if (i+1 == split.length/2) {
                System.out.print(" ");
            }
            System.out.print(split[i]);
        }
    }
}