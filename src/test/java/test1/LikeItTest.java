package test1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LikeItTest {

    @Test
    void likeItMaxPersonsMin1() {
        LikeIt li = new LikeIt();
        String result = li.display(new String[]{"Jan", "Aziz"}, -1);
        assertEquals("", result);
    }

    @Test
    void likeItMaxPersons0() {
        LikeIt li = new LikeIt();
        String result = li.display(new String[]{"Jan", "Aziz"}, 0);
        assertEquals("", result);
    }

    @Test
    void likeItNames0MaxPersons0() {
        LikeIt li = new LikeIt();
        String result = li.display(new String[]{}, 0);
        assertEquals("", result);
    }

    @Test
    void likeItNamesNullMaxPersons0() {
        LikeIt li = new LikeIt();
        String result = li.display(new String[]{null}, 0);
        assertEquals("", result);
    }

    @Test
    void likeItNames0MaxPersons1() {
        LikeIt li = new LikeIt();
        String result = li.display(new String[]{}, 1);
        assertEquals("no one likes this :-(", result);
    }

    @Test
    void likeItNamesNullMaxPersons1() {
        LikeIt li = new LikeIt();
        String result = li.display(new String[]{null}, 1);
        assertEquals("null likes this", result);
    }

    @Test
    void likeItNames1MaxPersons0() {
        LikeIt li = new LikeIt();
        String result = li.display(new String[]{"Jan"}, 0);
        assertEquals("", result);
    }

    @Test
    void likeItNames1MaxPersons1() {
        LikeIt li = new LikeIt();
        String result = li.display(new String[]{"Jan"}, 1);
        assertEquals("Jan likes this", result);
    }

    @Test
    void likeItNames1MaxPersonsMin1() {
        LikeIt li = new LikeIt();
        String result = li.display(new String[]{"Jan"}, -1);
        assertEquals("", result);
    }

    @Test
    void likeItNames3MaxPersons2() {
        LikeIt li = new LikeIt();
        String result = li.display(new String[]{"Jan", "Aziz", "Emre"}, 2);
        assertEquals("Jan, Aziz and 1 other like this", result);
    }

    @Test
    void likeItNames3WithNullMaxPersons2() {
        LikeIt li = new LikeIt();
        String result = li.display(new String[]{"Jan", null, "Emre"}, 2);
        assertEquals("Jan, null and 1 other like this", result);
    }

    @Test
    void likeItNames3WithEmptyStringMaxPersons2() {
        LikeIt li = new LikeIt();
        String result = li.display(new String[]{"Jan", "", "Emre"}, 2);
        assertEquals("Jan,  and 1 other like this", result);
    }

    @Test
    void likeItNames3MaxPersons1() {
        LikeIt li = new LikeIt();
        String result = li.display(new String[]{"Jan", "Aziz", "Emre"}, 1);
        assertEquals("Jan and 2 others like this", result);
    }

    @Test
    void likeItNames2MaxPersons2() {
        LikeIt li = new LikeIt();
        String result = li.display(new String[]{"Jan", "Aziz"}, 2);
        assertEquals("Jan and Aziz like this", result);
    }

    @Test
    void likeItNames2MaxPersons5() {
        LikeIt li = new LikeIt();
        String result = li.display(new String[]{"Jan", "Aziz"}, 5);
        assertEquals("Jan and Aziz like this", result);
    }



}
