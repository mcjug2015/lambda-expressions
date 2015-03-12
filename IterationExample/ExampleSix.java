package IterationExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


/**
 * Code example showing the parenthesis removed on the parameter in the lambda expression
 */
public class ExampleSix {

    public static void main(String[] args) {

        final List<String> friendsList = Arrays.asList("Isaac", "Victor", "Kevin", "Doug");

        Consumer<String> newComsumer = name -> System.out.println(name);

        friendsList.forEach(newComsumer);
    }
}

/*
   Something special that Java will do for an inferred single parameter lambda expression
 */
