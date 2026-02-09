public class Calories {
    public static double calculateCalories(int steps, double weight){
        double burned = steps * weight * 0.04;
        return burned;
    }

    public static void main(String[] args) {
        double result = calculateCalories(10000 , 54.0);
        System.out.println("You burned " + result + " calories");
    }
}
