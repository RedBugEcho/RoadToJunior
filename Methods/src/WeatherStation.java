public class WeatherStation {
    public static void main(String[] args) {
        int[] highestTemp = {13, 21, 23, 34, 23, 1};
        int high = findMax(highestTemp);
        System.out.println("Highest temp is: " + high);

    }

    public static int findMax(int[] temperatures){
        int max = temperatures[0];

        for (int i = 0 ; i < temperatures.length; i++){
            if (temperatures[i] > max){
                max = temperatures[i];
            }
        }
        return max;
    }
}