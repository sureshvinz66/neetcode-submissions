class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> s1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(s1.containsKey(s.charAt(i))) {
                s1.put(s.charAt(i), s1.get(s.charAt(i)) + 1);
            } else {
                s1.put(s.charAt(i), 1);
            }
        }
        for (int j=0; j<t.length(); j++) {
            if(s1.containsKey(t.charAt(j))) {
                s1.put(t.charAt(j), s1.get(t.charAt(j)) - 1);
                if(s1.get(t.charAt(j)) == 0) {
                    s1.remove(t.charAt(j));
                }
            } else {
                return false;
            }
        }
        System.out.println(s1);
        if(s1.size() == 0) {
            return true;
        }
        return false;

    }
}
