package Exercise03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecipeTest {
    @Test
    void Ingredients0_Persons0() {
        Recipe recipe = new Recipe("appeltaart");
        String result = recipe.print(0);
        assertEquals("appeltaart voor 0 personen", result);
    }

    @Test
    void Ingredients0_Persons1() {
        Recipe recipe = new Recipe("appeltaart");
        String result = recipe.print(1);
        assertEquals("appeltaart voor 1 persoon", result);
    }

    @Test
    void Ingredients1_Persons0() {
        Recipe recipe = new Recipe("appeltaart");
        recipe.addIngredient(new Ingredient(1, "kopje", "kopjes", "bloem"));
        String result = recipe.print(0);
        assertEquals("appeltaart voor 0 personen", result);
    }

    @Test
    void Ingredients1_Persons1() {
        Recipe recipe = new Recipe("appeltaart");
        recipe.addIngredient(new Ingredient(1, "kopje", "kopjes", "bloem"));
        String result = recipe.print(1);
        final String expected = "appeltaart voor 1 persoon\n1 kopje bloem";
        System.out.println(expected + "\n");
        assertEquals(expected, result);
    }

    @Test
    void Ingredients2_Persons1() {
        Recipe recipe = new Recipe("appeltaart");
        recipe.addIngredient(new Ingredient(1, "kopje", "kopjes", "bloem"));
        recipe.addIngredient(new Ingredient(2, "eetlepel", "eetlepels", "suiker"));
        String result = recipe.print(1);
        final String expected = "appeltaart voor 1 persoon\n1 kopje bloem\n2 eetlepels suiker";
        System.out.println(expected + "\n");
        assertEquals(expected, result);
    }

    @Test
    void Ingredients2_Persons10() {
        Recipe recipe = new Recipe("appeltaart");
        recipe.addIngredient(new Ingredient(1, "kopje", "kopjes", "bloem"));
        recipe.addIngredient(new Ingredient(2, "eetlepel", "eetlepels", "suiker"));
        String result = recipe.print(10);
        final String expected = "appeltaart voor 10 personen\n10 kopjes bloem\n20 eetlepels suiker";
        System.out.println(expected + "\n");
        assertEquals(expected, result);
    }

    @Test
    void RecipeFor4_PrintFor4() {
        Recipe recipe = new Recipe("cake", 4);
        recipe.addIngredient(new Ingredient(1, "kopje", "kopjes", "bloem"));
        recipe.addIngredient(new Ingredient(2, "eetlepel", "eetlepels", "suiker"));
        String result = recipe.print(4);
        final String expected = "cake voor 4 personen\n1 kopje bloem\n2 eetlepels suiker";
        System.out.println(expected + "\n");
        assertEquals(expected, result);
    }

    @Test
    void RecipeFor4_PrintFor8() {
        Recipe recipe = new Recipe("cake", 4);
        recipe.addIngredient(new Ingredient(1, "kopje", "kopjes", "bloem"));
        recipe.addIngredient(new Ingredient(2, "eetlepel", "eetlepels", "suiker"));
        String result = recipe.print(8);
        final String expected = "cake voor 8 personen\n2 kopjes bloem\n4 eetlepels suiker";
        System.out.println(expected + "\n");
        assertEquals(expected, result);
    }

}
