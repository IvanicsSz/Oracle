package Algorithms.Sorting;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingMain {

    public static void main(String[] args) {
        BubbleSort<Integer> iS = new BubbleSort<>();
        Integer[] listing = new Integer[]{10, 3, 12, 7, 5, 20, 100, 120, 2, 1, 0};
        int[] li = new int[]{10, 3, 12, 7, 5, 20, 100, 120, 2, 1, 0};
        MergeSort.mergeSort(li);
       // iS.sort(Arrays.asList(listing));
        System.out.println("Merge Sort list: " + li);
    }
}
