import java.util.Scanner;

public class TheEngineersDiary {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Print your avg grade: ");
        double avgGrade = userInput.nextDouble();

        if (avgGrade < 2.0) System.out.println("You need to pull up");
        int intGrade = (int) avgGrade;

        switch (intGrade){
            case 5:
                System.out.println("Excellent");
                break;
            case 4:
                System.out.println("Good result");
                break;
            case 3:
                System.out.println("Satisfatorily");
                break;
            default:
                System.out.println("Concentrate on your study");
        }


    }
}
