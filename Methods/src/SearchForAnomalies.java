public class SearchForAnomalies {
    public static void main(String[] args) {
        int[] temperatures = {1 , 23, 100 , 101 , 23 , -51};
        boolean trueOrFalse = hasAnomaly(temperatures);
        System.out.println("Has anomaly or not: " + trueOrFalse);
    }

    public static boolean hasAnomaly(int[] temperatures){
        for (int i = 0 ; i < temperatures.length ; i++){
            if (temperatures[i] > 100 || temperatures[i] < -50)return true;

        }
        return false;
    }
}
