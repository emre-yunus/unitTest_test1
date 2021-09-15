package Exercise01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayOfIntsSumOf3SmallestTest {

    private final ArrayOfInts arrayOfInts = new ArrayOfInts();

    @Test
    void exactly3() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{3, 2, 1});
        assertEquals(6, result);
    }

    @Test
    void lessThan3() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{1, 7});
        assertEquals(8, result);
    }

    @Test
    void moreThan3Ints() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{7, 2, 3, 4});
        assertEquals(9, result);
    }

    @Test
    void originalArrayNotModified() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{7, 5, 3, 4, 7});
        assertEquals(12, result);
    }

    @Test
    void emptyArray() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{});
        assertEquals(0, result);
    }

    @Test
    void nullArray() {
        int result = arrayOfInts.sumOf3SmallestInts(null);
        assertEquals(0, result);
    }

}