import java.util.Scanner;

public class Home_2_3_c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double sum = 0;
        System.out.print("Введите a (меньше 201): ");
        int a = in.nextInt();
        for (int i = a; i <= 200; i++){
            sum += i;
        }
        System.out.println("Среднее арефметическое: " + sum / (200 - a + 1));

        in.close();
    }
}
