package TransformExample;

import java.util.Arrays;
import java.util.List;


public class TransformExampleTwo {

    public static void main(String[] args) {

        final List<String> friendsList = Arrays.asList("Isaac", "Joe Bob", "Kevin", "Doug");

        friendsList.stream()
                   .map(name -> name.toUpperCase())
                   .forEach(name -> System.out.println(name));
    }
}

/*
  So much cleaner!!
  Let's read this out loud to see the actions being performed on friends...
     1. Take friends and stream it into map
     2. Map each name in our stream to it's upperCase form
     3. For each name in the returned collection from MAP, print out the name
*/
