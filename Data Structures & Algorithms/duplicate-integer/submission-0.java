class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set <Integer> myHash = new HashSet<>();
            for (int n:nums) {
                if (myHash.contains(n)){
                    return true;
                }
                myHash.add(n);
                
            }
        
        return false; 
    }
}