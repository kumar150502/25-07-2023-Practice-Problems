import java.util.ArrayList;
import java.util.HashSet;

public class HashSetToArrayList {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();
        hset.add("Apple");
        hset.add("Ball");
        hset.add("Car");
        hset.add("Dog");
        ArrayList<String> list = new ArrayList<>(hset);
        System.out.println("ArrayList : " + list);
    }
}