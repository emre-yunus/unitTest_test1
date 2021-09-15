package Exercise03;

import java.util.ArrayList;

public class Recipe {

    private final String dishName;
    private ArrayList<Ingredient> ingredients = new ArrayList<>();
    private int amountForRecipe = 1;


    public Recipe(String dishName) {
        this.dishName = dishName;
    }

    public Recipe(String dishName, int amountForRecipe) {
        this.dishName = dishName;
        this.amountForRecipe = amountForRecipe;
    }

    public String print(int nrOfPersons) {
        String personen = nrOfPersons == 1 ? " persoon" : " personen";
        String result = dishName + " voor " + nrOfPersons + personen;
        if (nrOfPersons == 0) return result;

        for (Ingredient ingredient : ingredients) {
            result += "\n" + ingredient.print(nrOfPersons / amountForRecipe);
        }
        return result;

    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }
}
