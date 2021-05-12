import java.util.Scanner;

public class Home_1_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите номер операции: 1. Сложение, 2. Вычитание, 3. Умножение \n");
        int operation = in.nextInt();

        switch (operation) {
            case 1:
                System.out.print("Сложение");
                break;
            case 2:
                System.out.print("Вычитание");
                break;
            case 3:
                System.out.print("Умножение");
                break;
            default:
                System.out.print("Операция неопределена");
                break;
        }

        in.close();
    }
}
