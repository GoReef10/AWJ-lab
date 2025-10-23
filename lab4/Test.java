public class Test {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        reverse(list);
        for(int i = 0; i < list.length; i++)
            System.out.println(list[i] + " ");
    }

    public static void reverse(int[] list) {
        int[] newList = new int[list.length];
        for(int i = 0; i < list.length; i++) {
            newList[i] = list[list.length-1-i];
        }
        list = newList;
    }
}
// se afiseaza 1, 2, 3, 4, 5 pe cate o linie separata
// intrucat functia reverse ia ca parametru un tablou care nu este alocat dinamic,
// intructiunea list = newList schimba doar referinta locala (din cadtrul functiei reverse())
// nu si referinta din main()
