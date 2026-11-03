class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> val = new HashSet<>();
        for(int i : nums) {
            if(val.contains(i)) {
                return true;
            } else {
                val.add(i);
            }
        }
        return false;
    }
}