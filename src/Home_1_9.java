import java.util.Scanner;

public class Home_1_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Первое число: ");
        int first = in.nextInt();
        System.out.print("Второе число: ");
        int second = in.nextInt();
        System.out.print("Третье число: ");
        int third = in.nextInt();

        int max_1_or_2 = Math.max(first, second);
        int max_1_or_2_or_3 = Math.max(max_1_or_2, third);

        System.out.printf("Максимальное число: %d \n", max_1_or_2_or_3);
        in.close();
    }
}
