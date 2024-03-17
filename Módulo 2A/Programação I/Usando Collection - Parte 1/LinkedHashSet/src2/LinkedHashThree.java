import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashThree {
    public static void main(String[] args) {

        LinkedHashSet<Integer> numerosLinkedHashSet = new LinkedHashSet<>();
        numerosLinkedHashSet.add(4);
        numerosLinkedHashSet.add(7);
        numerosLinkedHashSet.add(9);
        numerosLinkedHashSet.add(3);
        
        Iterator<Integer> iterator = numerosLinkedHashSet.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
