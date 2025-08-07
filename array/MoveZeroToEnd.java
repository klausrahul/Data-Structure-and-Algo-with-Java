package array;

public class MoveZeroToEnd {
    //Brute Force 

    // public void moveZeroes(int[] nums) {
    //     int n=nums.length;
    //     int temp[] = new int[n];
    //     int j=0;
    //     for(int i=0;i<n;i++){
    //         if(nums[i]!=0){
    //             temp[j++]=nums[i];
    //         }
    //     }
    //     for(int i=0;i<n;i++){
    //         nums[i]=temp[i];
    //     }
    // }


    //Optimal

    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
}
