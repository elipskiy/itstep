import java.util.Scanner;

public class Home_1_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Первое число: ");
        int first = in.nextInt();
        System.out.print("Второе число: ");
        int second = in.nextInt();

        if (first > second) {
            System.out.print(first + " больше " + second);
        } else if (second > first) {
            System.out.print(second + " больше " + first);
        } else {
            System.out.print(first + " равно " + second);
        }
        in.close();
    }
}
