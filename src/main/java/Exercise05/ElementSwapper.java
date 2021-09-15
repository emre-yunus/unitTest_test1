package Exercise05;

import java.util.Arrays;

public class ElementSwapper {
    /**
     * @param arr: array of Integers, these can be null
     * @return array of Integers, these can be null
     * The function returns a new array in which the smallest and the largest element are swapped.
     * All null-elements are ignored.
     */
    public Integer[] swapSmallestAndLargestElement(Integer[] arr) {
        if (arr == null) return null;
        final Integer[] result = Arrays.copyOf(arr, arr.length);
        if (arr.length <= 1) return result;

        Integer indexOfSmallest = null;
        Integer indexOfLargest = null;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] != null) {
                if (indexOfLargest == null || arr[i] >= arr[indexOfLargest]) indexOfLargest = i;
                if (indexOfSmallest == null || arr[i] <= arr[indexOfSmallest]) indexOfSmallest = i;
            }
        }
        if (indexOfSmallest != null) {
            int hulp = result[indexOfSmallest];
            result[indexOfSmallest] = result[indexOfLargest];
            result[indexOfLargest] = hulp;
        }
        return result;
    }
}
