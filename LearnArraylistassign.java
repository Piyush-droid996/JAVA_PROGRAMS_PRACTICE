import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class LearnArraylistassign 
{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        a.remove(Integer.valueOf(30));

        // c) update

        a.set(2, 89);

        // d) View all elements using Iterator
        System.out.println("View All elements:");
        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // getmethod
        System.out.println("Viewing element at index  : " + a.get(1));

        // f) Sort
        Collections.sort(a);

        // Display sorted elements
        System.out.println("Sorted elements:");
        for (Integer element : a) {
            System.out.println(element);
        }
    }
}
