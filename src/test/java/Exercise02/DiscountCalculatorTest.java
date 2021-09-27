package Exercise02;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountCalculatorTest {

    private final DiscountCalculator calc = new DiscountCalculator();

    @Test
    public void priceNegative() {
        int result = calc.calculatePrice(-5, 10);
        assertEquals(0, result);
    }

    @Test
    public void amountNegative() {
        int result = calc.calculatePrice(5, -10);
        assertEquals(0, result);
    }

    @Test
    public void noPrice() {
        int result = calc.calculatePrice(0, 10);
        assertEquals(0, result);
    }

    @Test
    public void amount0() {
        int result = calc.calculatePrice(10, 0);
        assertEquals(0, result);
    }

    @Test
    public void amount1() {
        int result = calc.calculatePrice(10, 1);
        assertEquals(10, result);
    }

    @Test
    public void amount10() {
        int result = calc.calculatePrice(10, 10);
        assertEquals(99, result);
    }

    @Test
    public void amount11() {
        int result = calc.calculatePrice(10, 11);
        assertEquals(108, result);
    }

    //@Test
    /*
    public void amountBetween11and19() {
        Random r = new Random();
        int amount = 11 + r.nextInt(8);
        int result = calc.calculatePrice(10, amount);
        assertEquals(9*10 + (amount-9)*9, result);
    }
    */

    @Test
    public void amount20() {
        int result = calc.calculatePrice(10, 20);
        assertEquals(188, result);
    }

    @Test
    public void amount50() {
        int result = calc.calculatePrice(10, 50);
        assertEquals(428, result);
    }

    @Test
    public void amount50AndPrice1() {
        int result = calc.calculatePrice(1, 50);
        assertEquals(42, result);
    }
}
