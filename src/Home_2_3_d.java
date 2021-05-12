import java.util.Scanner;

public class Home_2_3_d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите a: ");
        int a = in.nextInt();
        System.out.print("Введите b: ");
        int b = in.nextInt();

        int sum = 0;
        for (int i = a; i <= b; i++){
            sum += Math.pow(i, 2);
        }
        System.out.printf("Сумма квадратов: %d", sum);

        in.close();
    }
}
