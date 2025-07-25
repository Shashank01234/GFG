class Solution {
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        int count1=0;
        int count2=0;
       int n=nums.length;
       for(int i=0;i<n;i++){
           if((count1==0) && ele2!=nums[i]){
               ele1=nums[i];
               count1=1;
           }
           else if(count2==0 && ele1!=nums[i]){
               ele2=nums[i];
               count2=1;
           }
           else if(nums[i]==ele1)
               count1++;
            else if(nums[i]==ele2)
               count2++;
           else{
              count1--;
              count2--;
           }
              
         
              
       }
       List<Integer>ans=new ArrayList<>();
       int counter1=0;
      int counter2=0;
       for(int i=0;i<n;i++){
           if(nums[i]==ele1){
               counter1++;
           }
           else if(nums[i]==ele2){
               counter2++;
           }
       }
        if(counter1>n/3){
           ans.add(ele1);
       }
       
       if(counter2>n/3 && ele1!=ele2){
           ans.add(ele2);
       }
      
      
       Collections.sort(ans);
      return ans; 
    }
}