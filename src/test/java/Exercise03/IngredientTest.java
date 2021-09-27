package Exercise03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IngredientTest {
    @Test
    public void print1Appel() {
        Ingredient i = new Ingredient(1, "appel", "appels");
        assertEquals("1 appel", i.print(1));
    }
}
