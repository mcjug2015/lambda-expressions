package IterationExample;

import java.util.Arrays;
import java.util.List;


/**
 * Code example showing enhanced FOR loop to iterate through a list of strings
 *
 * Imperative Style
 */
public class ExampleTwo {

    public static void main(String[] args) {

        final List<String> friendsList = Arrays.asList("Isaac", "Mike", "Kevin", "Doug");

        /**
         * Under the hood this is using the Iterator interface
         * and calls its "hasNext" and "next" methods
         *
         * Better then ExampleOne's FOR loop
         */
        for(String friend : friendsList) {
        	System.out.println(friend);
        }
    }
}

/**
 * Java 8 has enhanced the Iterable interface to use a new .forEach()
 * ...let us look at ExampleThree to view this enhancement
 */
