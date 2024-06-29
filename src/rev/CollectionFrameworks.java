package rev;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class CollectionFrameworks {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        li.add(3);
        System.out.println(li);
        li.clear();
        li.add(3);
      li.offer(6);
      li.add(2);
        System.out.println(li);
        li.offerFirst(1);
        System.out.println(li);
        li.pollLast();
        System.out.println(li);
        Iterator<Integer> x =  li.descendingIterator();
//       while (x.hasNext()){
//           System.out.println(x);
//       }
//        System.out.println(x.hasNext());
        System.out.println(li);
        Stack<Integer> stack = new Stack<>();
        stack.pop();

    }
}
