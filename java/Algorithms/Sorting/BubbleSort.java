package Algorithms.Sorting;


import java.util.ArrayList;
import java.util.List;

public class BubbleSort<T extends Comparable<T>> {
    public List<T> sort(List<T> elements){
        T tmp;
        for (int i = 0; i < elements.size()-1; i++) {
            System.out.println(elements);
            for (int j = 1; j < elements.size()-i; j++) {
                System.out.println("element i: " + i);
                System.out.println(elements);
                System.out.println("elements changed: " + elements.get(j-1) +" " + elements.get(j));
                System.out.println("j: " + j);
                if (elements.get(j-1).compareTo(elements.get(j)) == 1) {
                    tmp = elements.get(j - 1);
                    elements.set(j - 1, elements.get(j));
                    elements.set(j, tmp);
                }
            }

        }
            System.out.println(elements);
        return elements;
    }
}
