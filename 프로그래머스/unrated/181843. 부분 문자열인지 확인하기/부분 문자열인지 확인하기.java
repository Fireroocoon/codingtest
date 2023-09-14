class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        boolean a;
        a = my_string.contains(target);
        answer = (a == true)? 1 : 0;
        return answer;
    }
}