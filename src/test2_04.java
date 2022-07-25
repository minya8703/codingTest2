import java.util.Scanner;

public class test2_04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }
    public static void solution(int n){
        int[] answer = new int[n];
        answer[0]= 1;
        answer[1]= 1;
        System.out.print(answer[0]+" "+ answer[1]+" ");
        for(int i=2; i<n; i++){
            answer[i]= answer[i-2]+answer[i-1];
            System.out.print(answer[i]+" ");
        }

    }
}
