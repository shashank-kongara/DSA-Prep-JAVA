package leetcode.arrays;
// https://leetcode.com/problems/shuffle-the-array/submissions/

// explanation -- https://leetcode.com/problems/shuffle-the-array/discuss/1314638/JAVA-C%2B%2B-%3A-Simple-or-O(1)-Space-In-Place-or-100-Faster-or-Efficient-or-Explained

class ShuffletheArray {
    public int[] shuffle(int[] nums, int n) {
        int len= nums.length;
        for(int i=n;i<len;i++){
            nums[i]=(nums[i]*1024)+nums[i-n]; //first i gave n-1 which is wrong
        }
        int index=0;
        for(int i=n;i<len;i++){
            nums[index]=nums[i]%1024;
            nums[index+1]=nums[i]/1024;
            index+=2;
        }
        return nums;

    }
}