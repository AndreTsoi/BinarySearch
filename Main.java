//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] myArray = {1, 3, 6, 7, 8, 16, 19, 23, 27, 30};
        System.out.println(BinarySearch(myArray, 0, 9, 23));






    }


    public static int BinarySearch(int[] nums, int start, int end, int target) {



        if (start <= end) {
            int middle = (start + end) / 2;

            if (nums[middle] == target) {
                return middle;
            } else if (target > nums[middle]) {
                return BinarySearch(nums, middle + 1, end, target);
            } else if (target < nums[middle]) {
                return BinarySearch(nums, start, middle -1, target);
            }

        }


        return -1;


    }



}