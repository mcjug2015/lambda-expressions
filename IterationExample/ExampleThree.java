package IterationExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Code example showing an anonymous inner class using a Consumer to iterate through a list of strings
 */
public class ExampleThree {

    public static void main(String[] args) {

        final List<String> friendsList = Arrays.asList("Isaac", "Mike", "Kevin", "Doug");


        /**
         * What exactly did we gain here?  Code is way more verbose
         *
         * Who wants to code anonymous inner classes??
         */
        friendsList.forEach(new Consumer<String>() {
            public void accept(final String name) {
                System.out.println(name);
            }
        });
    }
}
