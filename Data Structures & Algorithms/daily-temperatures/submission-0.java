class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer>stack=new Stack<>();
        int []answer=new int[n];
        for(int i=0;i<n;i++){
            int curr=temperatures[i];
             while (!stack.isEmpty() && curr > temperatures[stack.peek()]) { 
                int idx = stack.pop();                                     
                answer[idx] = i - idx;                                     
            }
            stack.push(i);
        }
        return answer;
    }
}
