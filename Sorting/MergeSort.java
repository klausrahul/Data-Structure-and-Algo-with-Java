class mergeSort {
    public int[] mergeSort(int[] nums) {
      int low = 0;
      int high = nums.length - 1;
      ms(nums, low, high);
      return nums;
    }
  
    public void ms(int[] nums, int low, int high) {
      if (low == high) {
        return;
      }
      int mid = (low + high) / 2;
      ms(nums, low, mid);
      ms(nums, mid + 1, high);
      merge(nums, low, mid, high);
    }
  
    public void merge(int[] nums, int low, int mid, int high) {
      int left = low;
      int right = mid + 1;
     // List<Integer> temp = new ArrayList<Integer>();
     int[] temp = new int[high-low+1];
     int j=0;
      while (left <= mid && right <= high) {
        if (nums[left] <= nums[right]) {
         // temp.add(nums[left]);
         temp[j++] = nums[left];
          left++;
        } else {
         // temp.add(nums[right]);
           temp[j++] = nums[right];
          right++;
        }
      }
  
      while (left <= mid) {
       // temp.add(nums[left]);
        temp[j++] = nums[left];
        left++;
      }
      while (right <= high) {
       // temp.add(nums[right]);
       temp[j++] = nums[right];
        right++;
      }
  
      for(int i=low;i<=high;i++){
         // nums[i]=temp.get(i-low);
         nums[i]=temp[i-low];
      }
  
    }
  }
  