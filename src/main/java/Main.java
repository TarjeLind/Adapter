public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(333, 333));
        System.out.println(intsCalc.sum(333, 256));
        System.out.println(intsCalc.pow(333, 128));

    }
}
