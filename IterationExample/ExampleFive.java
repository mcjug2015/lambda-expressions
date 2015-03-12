package IterationExample;

import java.util.Arrays;
import java.util.List;


/**
 * Code example showing a lambda expression with the type inference removed
 */
public class ExampleFive {

    public static void main(String[] args) {

        final List<String> friendsList = Arrays.asList("Isaac", "Mike", "Kevin", "Doug");

        friendsList.forEach((name) -> System.out.println(name));
    }
}

/*
   Type Inference...
      1. The compiler looked up the signature of the called method
      2. in this example...it looked up the signature for .forEach()
      3. Then the compiler analyzed the functional interface it takes as a parameter
      4. The compiler then looks at that interface's abstract method to determine
           the expected number of parameters and their types

    or simply put...
     Type inference is a Java compiler's ability to look at each method invocation and corresponding declaration
      to determine the type argument (or arguments) that make the invocation applicable.

 */

