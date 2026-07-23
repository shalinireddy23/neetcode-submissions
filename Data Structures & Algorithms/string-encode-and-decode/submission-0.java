class Solution {

    public String encode(List<String> strs) {
        StringBuffer sb=new StringBuffer();
        for(String str:strs){
           sb.append(str.length()).append('#').append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
       List<String>list=new ArrayList<>();
        int i=0;
       while(i<str.length()){
        int len=0;
        while(str.charAt(i)!='#'){
            len=len * 10 + (str.charAt(i) - '0');
            i++;
        }
        i++;
        String word=str.substring(i,i+len);
        list.add(word);
        i=i+len;
       }   
       return list;        
    }
}
