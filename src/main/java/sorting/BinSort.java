package sorting;

import java.util.Arrays;
import java.util.LinkedList;

public class BinSort {
    /**
     * Bin sort implementation -  add each element to the linked list
     * for the correct "bin", then use the array of bins to sort arr.
     * @param arr input array of records
     * @param maxValue largest value of the key; all keys are from 0 to maxValue.
     */
    public static void binSort(Elem[] arr, int maxValue) {
        int i;
        // Create bins
        LinkedList<Elem>[] bins = new LinkedList[maxValue + 1];
        // Create an empty linked list for each bin
        for (i = 0; i <= maxValue; i++)
            bins[i] = new LinkedList<Elem>();

        // FILL IN CODE:
        // Iterate over elements of arr, and add each element
        // to the linked list of the correct "bin"
        // FILL IN CODE: iterate over bins, and place elements from each linked
        // list back into arr

    }
}
