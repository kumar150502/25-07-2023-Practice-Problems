import java.util.ArrayList;
import java.util.LinkedList;
public class LinkedListToArrayList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Ball");
        linkedList.add("Cat");
        linkedList.add("Dog");
        linkedList.add("Shark");
        ArrayList<String> list = new ArrayList<>(linkedList);
        System.out.println("ArrayList contains: " + list);
    }
}
