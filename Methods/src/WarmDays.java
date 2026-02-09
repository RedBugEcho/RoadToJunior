public class WarmDays {
    public static void main(String[] args) {
        int [] warmDays = {21 , 12 , 32,  1, -2, -1 , -3, -32};
        int howMany = countWarmDays(warmDays);
        System.out.println("Warm days: " + howMany);
    }

    public static int countWarmDays(int[] temperatures){
        int count = 0 ;
        for(int i = 0 ; i < temperatures.length; i++){
            if (temperatures[i] > 0)
                count++;
        }
        return count;
    }
}
