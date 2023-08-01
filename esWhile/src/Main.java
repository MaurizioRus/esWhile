public class Main {
    public static void main(String[] args) {

        int botHolding = 10000;

        double poundToEuro;

        int daysToSell = 0;

        while (botHolding > 0) {

            poundToEuro = 1 + (Math.random() * 0.2);

            if (poundToEuro >= 1.15) botHolding -= 1000;

            daysToSell++;
        }

        System.out.println(daysToSell);
    }
}