import java.util.Scanner;

public class Home_1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Первая строка: ");
        String first_string = in.nextLine();
        System.out.print("Вторая строка: ");
        String second_string = in.nextLine();

        System.out.print(first_string + " .compareTo " + second_string + ": " + first_string.compareTo(second_string) + "\n");
        System.out.print(first_string + " .compareToIgnoreCase " + second_string + ": " + first_string.compareToIgnoreCase(second_string) + "\n");
        System.out.print(first_string + " .equals " + second_string + ": " + first_string.equals(second_string) + "\n");
        System.out.print(first_string + " .equalsIgnoreCase " + second_string + ": " + first_string.equalsIgnoreCase(second_string) + "\n");
        in.close();
    }
}
