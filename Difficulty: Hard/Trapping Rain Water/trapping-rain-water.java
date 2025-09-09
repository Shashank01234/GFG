class Solution {
    public int maxWater(int arr[]) {
        int left=0, right=arr.length-1;
        int leftMax = arr[left], rightMax = arr[right];
        int result=0;
        
        while(right>left){
            leftMax = Math.max(leftMax, arr[left]);
            rightMax = Math.max(rightMax, arr[right]);
            result += (leftMax-arr[left]) + (rightMax-arr[right]);
            
            if(leftMax > rightMax) right--;
            else left++;
        }
        
        return result;
        
    }
}
