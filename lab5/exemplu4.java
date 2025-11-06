import java.util.*;

public class exemplu4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("oan","tu","tri"));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = (String) iterator.next();
            System.out.println(element);
        }
    }
}

