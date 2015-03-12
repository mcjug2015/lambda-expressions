package TransformExample;

import java.util.Arrays;
import java.util.List;

public class TransformExampleThree {

    public static void main(String[] args) {

        final List<String> friends = Arrays.asList("Isaac", "Mike", "Kevin", "Doug");

        friends.stream().map(name -> name.length()).forEach(count -> System.out.println(count));
    }
}

/*
   Map is pretty handy
     A. Created a new output collection
     B. Collects the result of the running lambda expression
     C. Returns the result collection
 */
