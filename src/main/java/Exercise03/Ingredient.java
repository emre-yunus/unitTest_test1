package Exercise03;

public class Ingredient {
    private Integer amount;
    private String singular;
    private String plural;
    private String what;

    public Ingredient(String what) {
        this.what = what;
    }

    public Ingredient(int amount, String singular, String plural) {
        this.amount = amount;
        this.singular = singular;
        this.plural = plural;
    }

    public Ingredient(int amount, String singular, String plural, String what) {
        this.amount = amount;
        this.singular = singular;
        this.plural = plural;
        this.what = what;
    }

    public String print(int nrOfPortions) {
        if (nrOfPortions == 0) return "";
        if (amount == null) return what + " naar smaak";
        final int amountNeeded = amount * nrOfPortions;
        if (amountNeeded == 0) return "";
        final String postFix = what != null ? " " + what : "";
        if (amountNeeded == 1) {
            return "" + amountNeeded + " " + singular + postFix;
        }
        return "" + amountNeeded + " " + plural + postFix;
    }
}
