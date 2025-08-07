package array;

public class RemoveDulicateFromSotedArray {
    public int removeDuplicates(int[] nums) {
        //two pinter approach 

        //will create i variable which will point the unique element
        int i=0;

        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
        } 

        return (i+1);
    }
}
