public class TextFilter {
    public static boolean isSpam (String message){
        return message.contains("buy") ;
    }

    public static void main(String[] args) {
        String message1 = "I want to buy me a dog";
        String message2 = "I love dogs";

        boolean result1 = isSpam(message1);
        boolean result2 = isSpam(message2);

        System.out.println( message1 + " | " + result1);
        System.out.println( message2 + " | " + result2);
    }
}
