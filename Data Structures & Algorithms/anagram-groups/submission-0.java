class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String word=strs[i];
            int n=word.length();
            int freq[]=new int[26];
            for(int j=0;j<n;j++){
                char c=word.charAt(j);
                freq[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int num : freq) {
                sb.append(num);
                sb.append("#");
            }
            String key = sb.toString();
            if(map.containsKey(key)){
                map.get(key).add(word);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(key, list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
