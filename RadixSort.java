package for_interview;

import java.util.Arrays;
import java.util.LinkedList;
 
public class RadixSort {
 
    @SuppressWarnings("unchecked")
    // base 10
    // LinkedList is also a Queue
    private LinkedList<Integer>[] counter = new LinkedList[] {
        new LinkedList<Integer>(),
        new LinkedList<Integer>(),
        new LinkedList<Integer>(),
        new LinkedList<Integer>(),
        new LinkedList<Integer>(),
        new LinkedList<Integer>(),
        new LinkedList<Integer>(),
        new LinkedList<Integer>(),
        new LinkedList<Integer>(),
        new LinkedList<Integer>()
    };
 
    private RadixSort() {}
 
    public static RadixSort createInstance() {
        return new RadixSort();
    }
 
    public void sortLSD(int[] array, int maxDigitSymbols) {
        int mod = 10;
        int dev = 1;
        for (int i = 0; i < maxDigitSymbols; i++, dev *= 10, mod *= 10) {
            //System.out.println(Arrays.toString(array));
            for(int j = 0; j < array.length; j++) {
                int bucket = (array[j] % mod) / dev;
                counter[bucket].add(array[j]);
            }
            int pos = 0;
            for(int j = 0; j < counter.length; j++) {
                Integer value = null;
                while ((value = counter[j].poll()) != null) {
                    //System.out.println(value);
                    array[pos++] = value;
                }
            }
        }
 
    }
 
    public static void main(String[] args) {
 
        int[] test = { 170, 45, 75, 90, 802, 2, 24, 66 };
 
        RadixSort sorter = RadixSort.createInstance();
        // we choose 3, because we have 156 with 3 digits
        sorter.sortLSD(test, 3);
 
        System.out.println(Arrays.toString(test));
    }
 
}