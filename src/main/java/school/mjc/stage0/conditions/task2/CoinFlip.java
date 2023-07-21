package school.mjc.stage0.conditions.task2;

public class CoinFlip {
    public void throwCoin(int from1UpTo1000) {
        if (from1UpTo1000 < 500) {
            System.out.println("Eagle");
        } else {
            System.out.println("Tail");
        }
    }

    public static void main(String[] args) {
        CoinFlip coinFlip = new CoinFlip();

        int numberToCheck = 725; // You can change this number as needed

        System.out.println(numberToCheck);
        coinFlip.throwCoin(numberToCheck);
    }
}
