import java.util.Arrays;
import java.util.LinkedList;

/*
하샤드 수
18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18
arr	return
10	true
12	true
11	false
13	false
 */
public class PR12947_220715 {
    public static void main(String[] args) {
        System.out.print(solution(1234));


    }
    public static boolean solution(int x) {
        boolean answer = true;
        String numberStr = String.valueOf(x);
        char[] digits1 = numberStr.toCharArray();
        int sum = 0;
        for(int i=0; i<digits1.length; i++){
            sum += Character.getNumericValue(digits1[i]);
        }
        if((x%sum) !=0){
            answer = false;
        }
        return answer;
    }
}
