package arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] array ={1,3,5,6};
        System.out.println(searchInsert(array,2));

    }
    public static int searchInsert(int[] nums, int target) {
        int index=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                index=i;
                break;
            } else if (nums[i]<target) {
                index=i+1;
            }
        }
        return index;
    }
}
