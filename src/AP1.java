import java.util.ArrayList;

public class AP1 {
    public static void main(String[] args) {

    }
    public boolean scoresIncreasing(int[] scores) {
        for(int i = 0; i < scores.length - 1; i++){
            if(scores[i] + 1 > scores[i + 1] && scores[i] != scores[i + 1]){
                return false;
            }
        }
        return true;
    }
    public boolean scores100(int[] scores) {
        for(int i = 0; i < scores.length - 1; i++){
            if(scores[i] == 100){
                if(scores[i + 1] == 100){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean scoresClump(int[] scores) {
        int count = 0;
        for(int i = 0; i < scores.length - 2; i++){
            if(check3(scores[i], scores[i + 1], scores[i + 2])) count++;
        }
        return count > 0;
    }
    public boolean check3(int a, int b, int c){
        int minTemp = Math.min(a, b);
        int min = Math.min(minTemp, c);
        int maxTemp = Math.max(a, b);
        int max = Math.max(maxTemp, c);
        return (min + 2 >= max);
    }
}
