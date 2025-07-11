class Solution {
    public int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int pointer = arr.length - 2;
        
        while(pointer>=0 && arr[pointer] == arr[arr.length - 1]){
            pointer--;
        }
        
        if(pointer == -1){
            return pointer;
        }
        return arr[pointer];
    }
}