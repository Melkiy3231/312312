
package src.main.java.yaroslavshchur.collections.lists;
import java.util.List;
import java.util.ArrayList;
public class DivisionByThree {
    public static void DivideByThree() {
        List<Integer> intArrayList = DivisionByThree.initList();

        System.out.println("ArrayList before removing multiples of 3: ");
        DivisionByThree.printList(intArrayList);
        intArrayList.removeIf(n -> (n % 3) == 0);

        System.out.println("\n\nArrayList after removing numbers that are multiples of three:");
        DivisionByThree.printList(intArrayList);
    }
    public static List<Integer>  initList() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(11);
        list.add(18);
        list.add(20);
        list.add(22);

        return list;
    }
    public static void printList(List<Integer> list) {
        for (Integer elem: list) {
            System.out.print(elem + " ");
        }
    }

}