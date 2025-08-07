public class InsertionSort {
    public int[] insertionSort(int[] nums) {
        int n = nums.length;
        for(int i =0;i<n;i++){
            for(int j =i;j>0;j--){
                if(nums[j-1]>nums[j]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
        return nums;
    }
}
