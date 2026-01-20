import java.util.HashMap;

public class FrequencyCount {

    public static HashMap<Integer, Integer> countFrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        System.out.println(countFrequency(arr));
        // Output: {1=1, 2=2, 3=3, 4=1}
    }
}
