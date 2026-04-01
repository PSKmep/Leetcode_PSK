import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        TreeSet<Integer> onBulbs = new TreeSet<>();
        
        for (int b : bulbs) {
            if (onBulbs.contains(b)) {
                onBulbs.remove(b);
            } else {
                onBulbs.add(b);
            }
        }
        
        return new ArrayList<>(onBulbs);
    }
}

