class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stk = new ArrayDeque<>();
        int n =temperatures.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            while(!stk.isEmpty()&& temperatures[stk.peek()]<temperatures[i]){
                int j=stk.pop();
                res[j]=i-j;
            }
            stk.push(i);
        }
        return res;
    }
}
