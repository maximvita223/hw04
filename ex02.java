import java.util.LinkedList;

public class ex02 {
    public static void main(String[] args) {
        LinkedList<Integer> linkList = linkedList();
        enqueue("str", linkList);
        Object firstElementDel = dequeue(linkList);
        System.out.println(firstElementDel);
        System.out.println(linkList);
        Object firstEl = first(linkList);
        System.out.println(firstEl);
        System.out.println(linkList);
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

    public static LinkedList enqueue(Object a, LinkedList lst) {
        lst.addLast(a);
        System.out.println(lst);
        return lst;
    }

    public static Object dequeue(LinkedList lst) {
        Object firstEl = lst.getFirst();
        lst.removeFirst();
        return firstEl;
    }

    public static Object first(LinkedList lst) {
        Object firstEl = lst.getFirst();
        return firstEl;
    }
}
