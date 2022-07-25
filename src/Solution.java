/**
 * arr1	             arr2	         return
 * [[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
 * [[1],[2]]	    [[3],[4]]	    [[4],[6]]
 */
public class Solution {

    public static void main(String[] args) {
        int[][] arr1 = { { 1, 2 }, { 2, 3 } };
        int[][] arr2 = { { 3, 4 }, { 5, 6 } };
        System.out.println(solution(arr1, arr2));
    }
        public static int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = {};
            answer = arr1;
            System.out.printf("answer : " + answer);
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[0].length; j++) {
                    answer[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            return answer;
        }
}
