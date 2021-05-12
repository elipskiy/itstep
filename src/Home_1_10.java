import java.util.Scanner;

public class Home_1_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Сторона квадрата: ");
        int a = in.nextInt();

        if (a <= 0) {
            System.out.print("Введены некорректные данные");
        } else {
            System.out.printf("Площадь: %d \n", a * a);
            System.out.printf("Периметр: %d \n", a * 4);
        }

        in.close();
    }
}
