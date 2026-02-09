public class passwordValid {
    public static boolean isPasswordValid(String password){
        if (password.length() >= 8 ) return true;
        else return false;
    }

    public static void main(String[] args) {
        String myPassword = "qwertyui";

        boolean result = isPasswordValid(myPassword);

        System.out.println("Result is: " + result);
    }
}