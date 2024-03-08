import java.util. TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<String> playerSet = new TreeSet<String>();
        playerSet.add("Sonia");
        playerSet.add("Zelia");
        playerSet.add("Pedro");
        playerSet.add("Vanessa");
        playerSet.add("Sonia");

        System.out.println("Set Original." + playerSet);
        System.out.println("Primeiro Nome: " + playerSet.first());
        System.out.println("Ultimo Nome: " + playerSet.last());

        TreeSet<String> newPlaySet = (TreeSet<String>) playerSet.subSet("Marcos", "Vanessa");
        System.out.println("Sub set " + newPlaySet);
    }
}