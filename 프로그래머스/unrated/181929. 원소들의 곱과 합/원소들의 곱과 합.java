class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a = 0, b = 1;
        for(int i  = 0; i < num_list.length; i++) {
            b *= num_list[i];
            a += num_list[i];
        }
        a *= a;
        answer = (b < a)? 1 : 0;
        return answer;
    }
}