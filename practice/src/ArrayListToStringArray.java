import java.util.Arrays;
import java.util.ArrayList;
public class ArrayListToStringArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Ball");
        list.add("Cat");
        list.add("Dog");
        list.add("Egg");
        String[] array = list.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(array));
    }
}
