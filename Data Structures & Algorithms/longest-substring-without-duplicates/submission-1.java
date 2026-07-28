class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int i=0;
        int res=0;
        Map<Character, Integer>map=new HashMap<>();
        for(int j=0;j<n;j++){
            char c=s.charAt(j);
            if(map.containsKey(c)&&map.get(c)>=i){
                i=map.get(c)+1;
            }
            map.put(c,j);
            res=Math.max(res,j-i+1);
        }
        return res;
    }
}
