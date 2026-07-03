class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> read= new ArrayDeque<>();
        for(String token:tokens){
            if(token.length()>1 || Character.isDigit(token.charAt(0))){
                read.push(Integer.parseInt(token));
            }
            else{
                int y=read.pop();
                int x=read.pop();
                switch(token){
                    case "+":
                       read.push(x+y);
                       break;
                    case "-":
                       read.push(x-y);
                       break;
                    case "*":
                       read.push(x*y);
                       break;
                    default:
                       read.push(x/y);
                       break;
                    
                       
                }
            }
        }
        return read.pop();
        
    }
}
