import java.util.Scanner;

/**
 * 입력
 * 5
 * 87 89 92 100 76
 * 결과
 * 4 3 2 1 5
 */
public class test2_08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        for(int i=0; i<n; i++){
            score[i] = sc.nextInt();
        }
        solution(n, score);
    }
    private static void solution(int n, int[] score){
        int[] answer = new int[n];
        for(int i=0; i<n; i++){
            int cnt = 1;
            for(int j=0; j<score.length; j++){
                if(score[j]>score[i]){
                    cnt++;
                }
                answer[i] = cnt;
            }
            System.out.print(answer[i]+" ");
        }
    }
}
