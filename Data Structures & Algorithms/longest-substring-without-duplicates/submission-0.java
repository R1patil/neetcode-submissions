class Solution {
    public int lengthOfLongestSubstring(String s) {
         int[] charCount = new int[256];
      int left =0,right=0,maxlength=0;
      while(right<s.length()){
        char ch = s.charAt(right);
        if(charCount[ch]==0){
            charCount[ch]++;
            maxlength=Math.max(maxlength,right-left+1);
            right++;
        }
        else{
            charCount[s.charAt(left)]--;
            left++;
        }
      }
      return maxlength;
    }
}
