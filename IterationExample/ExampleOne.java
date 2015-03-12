package IterationExample;


import java.util.Arrays;
import java.util.List;


/**
 * Code example showing a basic FOR loop to iterate through a list of strings
 *
 * Imperative Style
 */
public class ExampleOne {

    public static void main(String[] args) {

        final List<String> friendsList = Arrays.asList("Isaac", "Mike", "Kevin", "Doug");

        /**
         * Is it "i <=" or "i <" ???
         */
        for (int i = 0; i < friendsList.size(); i++) {
            System.out.println(friendsList.get(i));
        }
    }
}
