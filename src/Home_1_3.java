import java.util.Scanner;

public class Home_1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Первая часть строки: ");
        String string_part_1 = in.nextLine();
        System.out.print("Вторая часть: ");
        String string_part_2 = in.nextLine();

        String result_string = string_part_1.concat(string_part_2);
        System.out.printf("Итоговая строка: %s \n", result_string);
        in.close();
    }
}
