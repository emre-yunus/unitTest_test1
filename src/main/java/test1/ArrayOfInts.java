package test1;

import java.util.*;

public class ArrayOfInts {
    public int[] findCommonElements(int[] arrLeft, int[] arrRight) {
        if (arrLeft == null || arrRight == null) return new int[]{};
        if (arrLeft.length == 0 || arrRight.length == 0) return new int[]{};

        ArrayList<Integer> arrListLeft = arrToArrList(arrLeft);
        ArrayList<Integer> arrListRight = arrToArrList(arrRight);

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer j : arrListLeft) {
            for (Integer k : arrListRight) {
                if (j == k ) {
                    result.add(k);
                    arrListRight.set(arrListRight.indexOf(j), null);
                    break;
                }
            }
        }

        int[] resultArray = new int[result.size()];
        for(int l= 0; l<result.size(); l++) {
            resultArray[l] = result.get(l);
        }

        Arrays.sort(resultArray);

        return resultArray;
    }

    private ArrayList<Integer> arrToArrList(int[] list) {
        ArrayList<Integer> arrList = new ArrayList<>();

        for(int i : list) {
            arrList.add(i);
        }

        return arrList;
    }
}

