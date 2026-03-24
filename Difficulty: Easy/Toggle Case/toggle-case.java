class Solution {
    public String toggleCase(String s) {
      
      char[] ch = s.toCharArray();
      
      for(int i=0; i<ch.length; i++) {
          if(ch[i] >= 65 && ch[i] <= 96) {
              ch[i] = (char) (ch[i] + 32);
          } else {
              ch[i] = (char) (ch[i] - 32);
          }
      }
        
      String ans = new String(ch);
      return ans;
    }
}
