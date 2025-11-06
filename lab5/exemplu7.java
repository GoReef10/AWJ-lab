import java.util.HashMap;
import java.util.Map;

public class exemplu7 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1", "eins");
        map.put("2", "zwei");
        System.out.println("map.size() = " + map.size());
        System.out.println(map.get("1"));
        for (String k : map.keySet())
            System.out.println(k);
    }
}
