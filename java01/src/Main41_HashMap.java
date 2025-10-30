import java.util.HashMap;

public class Main41_HashMap {

    public static void main(String[] args) {

        // HashMap - A data structure that stores key-value pairs, keys are unique, values - not
        // Does not maintain any order
        // <K, V> key values

        HashMap<String, Double> map = new HashMap<>();

        map.put("ferrari", 450000.0);
        map.put("aston martin", 200000.0);
        map.put("lamborghini", 350000.0);
        map.put("mclaren", 750000.0);
        map.put("pagani zonda", 1000000.0);

        map.remove("lamborghini");

        System.out.println(map);
        System.out.println(map.get("mclaren"));
        System.out.println(map.containsKey("lamborghini"));
        System.out.println(map.containsValue(1000000.0));
        System.out.println(map.size());

        for (String key : map.keySet()){
            System.out.printf("%s: € %,.2f\n", key, map.get(key));
        }

    }

}
