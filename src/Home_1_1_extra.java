import java.util.Scanner;

public class Home_1_1_extra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("a: ");
        int a = in.nextInt();
        System.out.print("b: ");
        int b = in.nextInt();
        System.out.print("l: ");
        int l = in.nextInt();
        System.out.print("n: ");
        int n = in.nextInt();

        // подсветка! %f
        System.out.printf("Длинна: %d \n", 2 * l + (2 * n - 1) * a + 2 * (n - 1) * b);
        in.close();
    }
}
