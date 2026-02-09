public class ArithmeticOfPositiveNumbers {
    public static void main(String[] args) {
        int[] weekTemps = {12, 21, 2 , 32 , -4 , -3 };

        double result = averageWarmTemps(weekTemps);
        System.out.println("Avg warm days: " + result);


    }

    public static double averageWarmTemps (int[] temperatures){
        int count = 0;
        int sum = 0;

        for (int i  = 0 ; i < temperatures.length ; i++){
            if (temperatures[i] > 0){
                count++;
                sum+= temperatures[i] ;

            }
        }

        if (count == 0 ) return 0.0;

        return (double) sum / count;

    }
}
