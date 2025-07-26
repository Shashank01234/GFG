class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num: arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int num: arr){
            if(set.add(num) && arr.length/3 < freq.get(num)){
                list.add(num);
            }
        }
        Collections.sort(list);
        
        return list;
    }
}