import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetTwo { 
    public static void main(String[] args) {

        ArrayList<Integer> numerosArraylist = new ArrayList<>(); 
        numerosArraylist.add(8); 
        numerosArraylist.add(5); 
        numerosArraylist.add(8);
        System.out.println("ArrayList: " + numerosArraylist);

        LinkedHashSet<Integer> numerosLinkedHashSet = new LinkedHashSet<>();
        numerosLinkedHashSet.addAll(numerosArraylist);
        numerosLinkedHashSet.add(4);
        System.out.println("LinkedHashSet: " + numerosLinkedHashSet); 
    }
}