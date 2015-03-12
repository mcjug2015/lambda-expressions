package FindItemsExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Code example showing how to find an element in a list using lambda expressions
 */
public class FindExampleTwo {

    public static void main(String[] args) {

        final List<String> friendsList = Arrays.asList("Isaac", "remove null", "Kevin", "Doug");

        final List<String> friendStartsWithD = friendsList.stream()
                                                .filter(name -> name.startsWith("D"))
                                                .collect(Collectors.toList());

        friendStartsWithD.forEach(System.out::println);
    }

}

/*
  FILTER
    A. Expects a lambda expression that returns a boolean result
       1. If TRUE is returned
           THEN the element in context while executing that lambda expression is added to the result collection
          ElSE
            it's skipped


 */
