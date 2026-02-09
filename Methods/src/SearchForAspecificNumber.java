public class SearchForAspecificNumber {
    public static void main(String[] args) {
        int[] nums = {12, 21, 23, 432, 21, 232};
        boolean found = containsNumbers(nums,432);
        System.out.println("Is 432 in list: " + found);
        boolean found2 = containsNumbers(nums,999);
        System.out.println("Is 999 in list? " + found2);
    }

    public static boolean containsNumbers(int[] numbers , int target){

        for (int i = 0 ; i < numbers.length ; i++){
            if (numbers[i] == target) return true;
        }
        return false;
    }
}
