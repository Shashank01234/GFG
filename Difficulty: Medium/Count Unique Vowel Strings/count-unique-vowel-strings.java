class Solution {
    public int vowelCount(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        for(char ch: s.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        
        if(map.isEmpty())
            return 0;
            
        int count = 0;
        int mul = 1;
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            mul*=entry.getValue();
            count++;
        }
        
        int fact = factorial(count);
        
        return fact*mul;
    }
    
    private static int factorial(int count){
        int fact=1;
        for(int i=1; i<=count; i++){
            fact*=i;
        }
        
        return fact;
    }
}