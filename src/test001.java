import java.util.Arrays;

public class test001 {
    public static void main(String[] args) {
        int[] d = {2,2,3,3};
        int budget = 10;
        solution(d, budget);
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        int[] sortD = d;
        Arrays.sort(sortD);
        for (int i : sortD) {
            sum += i;
            if(sum - budget <=0){
                answer++;
            }
        }
        return answer;
    }
}
