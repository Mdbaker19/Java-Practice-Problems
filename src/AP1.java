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
}
