import java.util.ArrayList;
import java.util.List;

public class Printer<V> {
    public void printArray(List<V> input){
        for (V i : input){
            System.out.println(i);
        }
    }
}
