class BubbleSort {
    public int[] bubbleSort(int[] nums) {
        int n = nums.length;
        for(int i=0;i<=n-2;i++){
            for(int j=0;j<n-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

        return nums;
    }
}