package src.main.java.yaroslavshchur.collections;
import src.main.java.yaroslavshchur.collections.lists.DivisionByThree;
import src.main.java.yaroslavshchur.collections.lists.TaskWithFruit;
import src.main.java.yaroslavshchur.collections.lists.SimilarElements;

public class Executor {
    public void executeApplication() {
        DivisionByThree divisionByThree = new DivisionByThree();
        divisionByThree.DivideByThree();
        System.out.println("--------------");
        TaskWithFruit fruitsList = new TaskWithFruit();
        fruitsList.addValue("Mango", "Melon", "Orange", "Grape");
        fruitsList.replaceValue("Orange", "Grapefruit");
        fruitsList.print();
        System.out.println("\n\t\t\t\t\t\tTASK #3");
        SimilarElements.checkElem();
    }
}