package Exercise05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ElementSwapperTest {
    private ElementSwapper swapper;

    @BeforeEach
    public void makeSwapper() {
        this.swapper = new ElementSwapper();
    }

    @Test
    public void nullArray() {
        Integer[] array = null;
        swapper.swapSmallestAndLargestElement(array);
        assertArrayEquals(null, swapper.swapSmallestAndLargestElement(array));
    }

    @Test
    public void emptyArray() {
        Integer[] array = new Integer[0];
        swapper.swapSmallestAndLargestElement(array);
        assertArrayEquals(new Integer[0], swapper.swapSmallestAndLargestElement(array));
    }

    @Test
    public void oneElementArray() {
        Integer[] array = new Integer[]{5};
        swapper.swapSmallestAndLargestElement(array);
        assertArrayEquals(new Integer[]{5}, swapper.swapSmallestAndLargestElement(array));
    }

    @Test
    public void twoElementArray() {
        Integer[] array = new Integer[]{5,9};
        swapper.swapSmallestAndLargestElement(array);
        assertArrayEquals(new Integer[]{9,5}, swapper.swapSmallestAndLargestElement(array));
    }

    @Test
    public void moreElementArray() {
        Integer[] array = new Integer[]{5,1,7,2,-5,6};
        swapper.swapSmallestAndLargestElement(array);
        assertArrayEquals(new Integer[]{5,1,-5,2,7,6}, swapper.swapSmallestAndLargestElement(array));
    }

    @Test
    public void nullElementArray() {
        Integer[] array = new Integer[]{null,null};
        swapper.swapSmallestAndLargestElement(array);
        assertArrayEquals(new Integer[]{null,null}, swapper.swapSmallestAndLargestElement(array));
    }

    @Test
    public void nullAndNotNullElementArray() {
        Integer[] array = new Integer[]{null,5,null};
        swapper.swapSmallestAndLargestElement(array);
        assertArrayEquals(new Integer[]{null,5,null}, swapper.swapSmallestAndLargestElement(array));
    }

    @Test
    public void nullAndMoreNotNullElementArray() {
        Integer[] array = new Integer[]{null,5,null,2,7};
        swapper.swapSmallestAndLargestElement(array);
        assertArrayEquals(new Integer[]{null,5,null,7,2}, swapper.swapSmallestAndLargestElement(array));
    }

    @Test
    public void moreElementWithEqualSmallArray() {
        Integer[] array = new Integer[]{5,1,7,2,1,6};
        swapper.swapSmallestAndLargestElement(array);
        assertArrayEquals(new Integer[]{5,1,1,2,7,6}, swapper.swapSmallestAndLargestElement(array));
    }

    @Test
    public void moreElementWithEqualBigArray() {
        Integer[] array = new Integer[]{5,1,7,2,7,6};
        swapper.swapSmallestAndLargestElement(array);
        assertArrayEquals(new Integer[]{5,7,7,2,1,6}, swapper.swapSmallestAndLargestElement(array));
    }
}
