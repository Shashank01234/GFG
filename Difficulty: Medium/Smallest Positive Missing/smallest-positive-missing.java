class Solution {
    public int missingNumber(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int num: arr){
            list.add(num);
        }
        
        int pointer=1;
        while(pointer<=arr.length){
            if(!list.contains(pointer)){
                break;
            }
            
            pointer++;
        }
        
        return pointer;
    }
}
