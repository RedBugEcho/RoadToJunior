public class Min {
    public static int findMin(int a, int b){
        if (a < b) return a;
        else return b;
    }

    public static void main(String[] args) {
        int min = findMin(10 , 5);
        System.out.println(min);
    }
}
