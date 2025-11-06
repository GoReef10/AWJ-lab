import java.util.HashSet;
import java.util.Set;

public class exemplu5 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("halo");
        set.add("halo");
        set.add("olah");
        System.out.println("Set size: " + set.size());
        System.out.println("Set: " + set);
    }
}
