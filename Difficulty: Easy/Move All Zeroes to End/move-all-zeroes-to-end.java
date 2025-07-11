// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        int left=0;
        while(left<arr.length && arr[left]!=0){
            ++left;
        }
        
        int right = left+1;
        
        while(right<arr.length){
            if(arr[left] == 0)
                if(arr[right] == 0)
                    right++;
                else{
                    int temp = arr[left];
                    arr[left++] = arr[right];
                    arr[right++] = temp;
                }
            else{
                left++;
            }
        }
    }
}