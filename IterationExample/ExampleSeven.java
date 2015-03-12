package IterationExample;

import java.util.Arrays;
import java.util.List;


/**
 * Code example showing a lambda expression using a method reference
 */
public class ExampleSeven {

    public static void main(String[] args) {

        final List<String> friendsList = Arrays.asList("Isaac", "Mike", "Kevin", "Doug");

        friendsList.forEach(System.out::println);
    }
}

/*
   Lambda expressions and method references are interchangeable

   This increases readability
 */