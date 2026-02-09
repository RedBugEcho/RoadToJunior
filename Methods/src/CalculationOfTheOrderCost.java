public class CalculationOfTheOrderCost {
    public static double calculateTotal (double price , int quantity , String promoCode){
        double totalAmount = price * quantity;

        if (promoCode.equals("SALE10")) {
            totalAmount *= 0.9;
        }

        if (totalAmount > 5000) System.out.println("You get free delivery!");
        return totalAmount;
    }

    public static void main(String[] args) {
        double product = calculateTotal(5493, 1, "SALE10");
        System.out.println("Your total cost is: " + product);
    }
}
