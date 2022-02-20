// 0219

class Solution {
    int answer = 0;
    public void DFS(int[] arr, int depth, int target, int sum){
        if (depth == arr.length) { // 모든 노드 탐색 완료
            if (sum == target) answer++;
        }
        else {
            DFS(arr, depth+1, target, sum+arr[depth]);
            DFS(arr, depth+1, target, sum-arr[depth]);
        }
    }
    
    public int solution(int[] numbers, int target) {
        
        DFS(numbers, 0, target, 0);
        
        return answer;
    }
    
}