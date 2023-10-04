//The utility code below is the most efficient way to rotate the array to right by k times.

class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        rotateArray(nums, 0, nums.length -k-1);
        rotateArray(nums, nums.length -k, nums.length-1);
        rotateArray(nums, 0, nums.length-1);
        return;
    }
    private void rotateArray(int[] arr, int i, int j){
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
        return;
    }
}
