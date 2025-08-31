// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        int result=-1;
        int r=0;
        for(int i=0; i<arr.length; ++i){
            int ones = noOfOnes(arr[i]);
            
            if(ones>0){
                result = r<ones ? i:result;
                r= r<ones ? ones:r;
            }
        }
        
        return result;
    }
    
    private int noOfOnes(int[] arr){
        int count=0;
        for(int i=0; i<arr.length; ++i){
            if(arr[i]==1){
                count++;
            }
        }
        
        return count;
    }
}