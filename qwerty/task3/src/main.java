import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Printer p = new Printer();
        List<Integer> i= new ArrayList<>();
        i.add(1);
        i.add(2);
        i.add(3);
        List<String> s = new ArrayList<>();
        s.add("Hello");
        s.add("World");
        p.printArray(i);
        p.printArray(s);
    }
}
