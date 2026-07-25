class Solution {
    public boolean isPalindrome(String s) {
        String ss=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String r=new StringBuffer(ss).reverse().toString();
        return ss.equals(r);        
    }
}
