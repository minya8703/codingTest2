import java.util.Scanner;

public class test2_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            System.out.print(solution(n, arr));
        }
    }

    private static int solution(int n, int[] arr) {
        int answer = 0;
        for(int i = 1; i<n; i++){
            if(arr[i]>arr[i-1]) answer = arr[i];
        }
        return answer;
    }
}
