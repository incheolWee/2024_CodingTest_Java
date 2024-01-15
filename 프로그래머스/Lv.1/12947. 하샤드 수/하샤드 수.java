class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String term = x+"";
        int sum=0;
        for(int i = 0; i< term.length(); i++){
            sum += term.charAt(i) -'0';
        }
        if(x%sum!=0){
            answer = false;
        }
        return answer;
    }
}