import java.util.Scanner;

public class ageCheck {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        userInput.useLocale(java.util.Locale.US);

        System.out.print("Print your age - ");
        int age = userInput.nextInt();
        System.out.println("Your age - " + age);

        System.out.print("Print your name - ");
        String name = userInput.next() ;
        System.out.println("Your name - " + name);

        System.out.print("Print your avg grade - ");
        double avgGrade = userInput.nextDouble();
        System.out.println("Your avg grade - " + avgGrade);

        if (age > 18) System.out.println("You allowed to enter");

    }
}