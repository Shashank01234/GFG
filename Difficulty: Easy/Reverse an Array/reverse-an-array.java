class Solution {
    public void reverseArray(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        
        while(right>left){
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
}