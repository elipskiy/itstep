import java.util.Scanner;

public class Home_1_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите номер операции: 1. Сложение, 2. Вычитание, 3. Умножение \n");
        int operation = in.nextInt();
        System.out.print("Первое число: ");
        int first = in.nextInt();
        System.out.print("Второе число: ");
        int second = in.nextInt();

        switch (operation) {
            case 1:
                System.out.printf("Результат: %d", first + second);
                break;
            case 2:
                System.out.printf("Результат: %d", first - second);
                break;
            case 3:
                System.out.printf("Результат: %d", first * second);
                break;
            default:
                System.out.print("Операция неопределена");
                break;
        }

        in.close();
    }
}
