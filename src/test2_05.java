import java.util.Scanner;

public class test2_05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
    private static int solution(int n){
        int cnt = 0;
        int[] ch= new int[n+1];

        for(int i=2; i<n; i++){
            if(ch[i]==0){
                cnt++;
                System.out.print( i+ " ");
                for(int j=i; j<=n; j=j+i) {
                    ch[j]=1;
                }
            }
        }
        return cnt;
    }
}
