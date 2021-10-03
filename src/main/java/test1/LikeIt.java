package test1;

public class LikeIt {
    //write the tests for this code
    public String display(String[] names, int maxPersons) {
        if (maxPersons <= 0 || names == null) return "";
        if (names.length == 0) return "no one likes this :-(";
        if (names.length == 1) return names[0] + " likes this";

        int nrOfNamesDisplayed = (maxPersons < names.length) ? Math.max(maxPersons - 1, 1) : names.length;
        int nrOfRemainingNames = names.length - nrOfNamesDisplayed;
        int nrOfThingsToDisplay = nrOfNamesDisplayed + (nrOfRemainingNames > 0 ? 1 : 0);

        String result = "";
        for (int i = 0; i < nrOfThingsToDisplay - 1; i++) {
            if (i > 0) result += ", ";
            result += names[i];
        }
        if (nrOfThingsToDisplay > 1)
            if (nrOfRemainingNames > 1)
                result += String.format(" and %d others", nrOfRemainingNames);
            else if (nrOfRemainingNames > 0)
                result += String.format(" and %d other", nrOfRemainingNames);
            else
                result += " and " + names[names.length - 1];
        return result + " like this";
    }
}
