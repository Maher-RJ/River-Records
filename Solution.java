import java.util.List;

public class Solution {

    public static int maxTrailing(List<Integer> levels) {

        int max = -1;
        for(int i = 1; i < levels.size(); i++) {

            for(int j = i - 1; j >= 0; j--) {

                int first = levels.get(i);
                int second = levels.get(j);
                int difference = first - second;
                if(difference > 0 && difference > max) {
                    max = difference;
                }
            }
        }
        
        return max;
    }
}
