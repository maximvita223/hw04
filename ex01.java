import java.util.ArrayDeque;
import java.util.LinkedList;

public class ex01 {

    public static void main(String[] args) {
        LinkedList<Integer> linkList = linkedList();
        revers(linkList);
    }

    public static LinkedList<Integer> revers(LinkedList<Integer> lst) {
        ArrayDeque<Integer> arr = new ArrayDeque<>();
        for (int i = 0; i < lst.size(); i++) {
            arr.add(lst.get(i));

        }
        while (lst.size() > 0) {
            lst.removeFirst();
        }
        while (arr.size() > 0) {
            lst.add(arr.getLast());
            arr.remove(arr.getLast());
        }
        System.out.println(lst);
        return lst;

    }

    public static LinkedList<Integer> linkedList() {
        LinkedList<Integer> lst = new LinkedList<>();
        lst.addLast(1);
        lst.addLast(2);
        lst.addLast(3);
        lst.addLast(4);
        System.out.println(lst);
        return lst;
    }
}
