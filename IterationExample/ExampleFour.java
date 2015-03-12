package IterationExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Code showing the use of a lambda expression to iterate through a list of strings
 */
public class ExampleFour {

    public static void main(String[] args) {

        final List<String> friendsList = Arrays.asList("Isaac", "Mike", "Kevin", "Doug");


        /**
         * .forEach is a higher order function
         */
        friendsList.forEach((final String name) -> System.out.println(name));


        /**
         * ....another way to do this...
         */


        /**
         * Example of how a Consumer can be assigned a lambda expression
         */
//        Consumer consumer = (String x) -> System.out.println(x);
//        friendsList.forEach(consumer);


    }
}
