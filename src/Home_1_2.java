import java.util.Scanner;

public class Home_1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Первое число: ");
        int first = in.nextInt();
        System.out.print("Второе число: ");
        int second = in.nextInt();

        int swap = first;
        first = second;
        second = swap;

        System.out.printf("Первое число: %d \n", first);
        System.out.printf("Второе число: %d \n", second);
        in.close();
    }
}
