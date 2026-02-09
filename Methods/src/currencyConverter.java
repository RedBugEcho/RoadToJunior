public class currencyConverter {
    public static double convertToPln(double usdt ){
        double convert = usdt * 4;
        return convert;
    }

    public static void main(String[] args) {
        double myWallet = 100.0;

        double result = convertToPln(myWallet);


        System.out.println("Result: " + result );
    }
}