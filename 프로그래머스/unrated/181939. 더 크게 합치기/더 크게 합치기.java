class Solution {
    public int solution(int a, int b) {
      String s1 = Integer.toString(a);
      String s2 = Integer.toString(b);
      String s12 = s1 + s2;
      String s21 = s2 + s1;
      int answer = Math.max(Integer.parseInt(s12), Integer.parseInt(s21));
      return answer;
    }
}