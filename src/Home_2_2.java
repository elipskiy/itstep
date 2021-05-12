public class Home_2_2 {
    public static void main(String[] args) {
        double cash = 100;
        int year = 0;

        do {
            year = year + 1;
            cash = cash * 1.02;
        } while (cash < 200);

        System.out.println("Через " + year + " год/лет будет " + cash + " $");
    }
}
