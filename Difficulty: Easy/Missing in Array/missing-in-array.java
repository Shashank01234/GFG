class Solution {
    int missingNum(int arr[]) {
        Arrays.sort(arr);
        int result = arr.length+1;
        for(int i=1; i<=arr.length; i++){
            if(i != arr[i-1]){
                result = i;
                break;
            }
        }
        
        return result;
    }
}