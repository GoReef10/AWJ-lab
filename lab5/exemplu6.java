import java.util.*;

public class exemplu6 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("aaaa");
        queue.add("jutor");
        List<String> list = new ArrayList<>(queue);
        list.add("jutor");
        System.out.println("List: " + list);
        Set<String> set = new HashSet<>(list);
        System.out.println("Set: " + set);
        System.out.println("Set size (fara duplicate) = " + set.size());
    }
}
