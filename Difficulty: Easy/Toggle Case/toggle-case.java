class Solution {
    public String toggleCase(String s) {
      
      char[] ch = s.toCharArray();
      
      for(int i=0; i<ch.length; i++) {
          if(ch[i] >= 65 && ch[i] <= 90) { // 'A' -> 65 'Z' -> 90
              ch[i] = (char) (ch[i] + 32);
          } else { // 'a' -> 97 'z' -> 122
              ch[i] = (char) (ch[i] - 32);
          }
      }
        
      String ans = new String(ch);
      return ans;
    }
}
