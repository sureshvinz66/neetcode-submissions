class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String,List<String>> store = new HashMap<>();

        for(String i: strs) {
            int[] key = new int[26];
            for(int j = 0; j < i.length(); j++) {
                key[i.charAt(j) - 'a']++;
            }
            if(store.containsKey(Arrays.toString(key))) {
                store.get(Arrays.toString(key)).add(i);
            } else {
                List<String> s = new ArrayList<>();
                s.add(i);
                store.put(Arrays.toString(key), s);
            }
        }
        store.forEach((k,v) -> res.add(v));
        return res;
    }
}
