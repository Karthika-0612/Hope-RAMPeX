//Lr=eetcode 1295: Find Numbers with Even Number of Digits
public class lc1295 {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (Integer.toString(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));  
    }
}
