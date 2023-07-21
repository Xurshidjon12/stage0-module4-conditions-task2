package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        if(first>second){
            System.out.println(first);
        }
        else if (second>first){
            System.out.println(second);
        }
        else {
            System.out.println(first);
        }
    }

    public static void main(String[] args) {
        GreatestNumberPrinter printer = new GreatestNumberPrinter();

        int first = 5;
        int second = 6;

        printer.printGreatest(first, second);
    }
}
