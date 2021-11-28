public class Main {
    public static void main(String[] args) {
        int ticketPrice = 10_000;
        int amountForOneMile = 20;
        int miles = ticketPrice / amountForOneMile;

        System.out.println("Начислено бонусных миль: " + miles);
    }
}
