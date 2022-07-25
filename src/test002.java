/*
[w, h]
sizes	result
[[60, 50], [30, 70], [60, 30], [80, 40]]	4000 4000(80 x 50)
[[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]	120 120(=8 x 15)을 return
[[14, 4], [19, 6], [6, 16], [18, 7], [18, 7]]	133 133(=19 x 7)
 */
public class test002 {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println("sizes = " + solution(sizes));
        int[][] sizes1 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        System.out.println("sizes = " + solution(sizes1));
        int[][] sizes2 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {18, 7}};
        System.out.println("sizes = " + solution(sizes2));
    }
    public static int solution(int[][] sizes) {
        int answer = 0;
        int hSize = 0;
        int wSize = 0;
        for(int i=0; i<sizes.length; i++){
            //가로보다 세로가 더 길다면 두 인덱스 변경
            int temp = 0;
            if(sizes[i][0] < sizes[i][1]){
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }

            if(sizes[i][0]>wSize){
                wSize = sizes[i][0];
            }
            if(sizes[i][1]>hSize){
                hSize = sizes[i][1];
            }
        }
        answer = wSize * hSize;

        return answer;
    }
}
