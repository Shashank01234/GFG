class Solution {
    static void rotateArr(int arr[], int d) {
        int index = d % arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<index; i++)
            list.add(arr[i]);
        
        for(int i=index; i<arr.length; i++)
            arr[i-index] = arr[i];
        
        int x=0;   
        for(int i=arr.length-index; i<arr.length; i++)
            arr[i]=list.get(x++);
    }
}