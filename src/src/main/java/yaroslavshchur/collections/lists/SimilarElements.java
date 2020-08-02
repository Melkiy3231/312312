package src.main.java.yaroslavshchur.collections.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimilarElements {
    private final Random rand = new Random();

    public static void checkElem() {

        System.out.println("First number list: ");
        List<Integer> numbers1 = new ArrayList<>();

        SimilarElements elem = new SimilarElements();
        elem.initRandList(15, numbers1);

        System.out.println("\n\nSecond number list: ");
        List<Integer> numbers2 = new ArrayList<>();

        elem.initRandList(13, numbers2);

        System.out.println("\n\nSimilar elements: ");
        numbers1.retainAll(numbers2);
        System.out.println(numbers1);
    }

    public void initRandList(int m, List<Integer> list) {
        for (int i = 0; i < m; i++) {
            list.add(rand.nextInt(20));
            System.out.print(list.get(i) + " ");
        }
    }
}