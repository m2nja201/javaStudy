// 0216

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if (i!=j){
                    for (int k = j+1; k <nums.length; k++){
                        int row = nums[i]+nums[j]+nums[k];
                        if (isDecimal(row)) {
                                answer++;
                        }
                    }
                }
            }
        }
        return answer;
    }
    
    public boolean isDecimal(int num){
        for (int i=2; i<=Math.sqrt(num); i++){
            if (i==num) continue;
            if((num%i)==0) return false;
        }
        return true;
    }
   /* public boolean Exist(int[] sums, int number, int counts){
        for (int i = 0; i<2000; i++){
            if(sums[i] == number) return true;
        }
        return false;
    }*/
}