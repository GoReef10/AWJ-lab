import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exemplu3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("primu");
        list.add("al doilea");
        list.add("al treilea");
        String s1 = "al patrulea";         list.add(s1);
        list.add("5");
        list.add(null);
        list.add(1, "Java");
        list.set(3, "altJava");
        System.out.println("List size = " + list.size());
        System.out.println("List: " + list);
        System.out.println("indexOf Hello = " + list.indexOf("Hello"));
        System.out.println("lastIndexOf Hello = " + list.lastIndexOf("Hello"));
        list.remove(null);
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
    }
}