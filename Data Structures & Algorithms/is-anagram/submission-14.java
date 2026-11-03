class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length() != t.length()) {
        return false;
    }
    int[] ind = new int[26];
    for(int i = 0; i < s.length(); i++) {
        ind[s.charAt(i) - 'a'] =  ind[s.charAt(i) - 'a'] + 1;
    }
    for(int i= 0; i< t.length(); i++) {
        ind[t.charAt(i) - 'a'] =  ind[t.charAt(i) - 'a'] - 1;
        if(ind[t.charAt(i) - 'a'] < 0) {
            return false;
        }
    }

    for(int i: ind) {
        if(i > 0) {
            return false;
        }
    }
    return true;
    }
}
