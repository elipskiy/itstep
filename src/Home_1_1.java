import java.util.Scanner;

public class Home_1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Займ: ");
        int n = in.nextInt();
        System.out.print("Лет: ");
        int y = in.nextInt();
        System.out.print("Процент: ");
        float p_raw = in.nextInt();

        float percent = p_raw / 100;
        double in_month = (n * percent * Math.pow((1 + percent), y)) / (12 * (Math.pow(1 + percent, y) - 1));

        System.out.printf("В месяц: %f \n", in_month);
        System.out.printf("Всего выплатить: %f \n", in_month * 12 * y);
        in.close();
    }
}
