import java.util.ArrayList;
import java.util.Arrays;
public class ArrayToArrayList {
    public static void main(String[] args) {
        String[] array = {"Apple", "Ball", "Cat", "Dog", "Egg"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println("ArrayList : " + list);
    }
}