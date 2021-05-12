import java.util.Scanner;

public class Home_2_3_b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int multiply = 1;
        System.out.print("Введите a (больше 0, меньше 21): ");
        int a = in.nextInt();
        for (int i = a; i <= 20; i++){
            multiply *= i;
        }
        System.out.printf("Произведение от %d до 20: %d", a, multiply);

        in.close();
    }
}
