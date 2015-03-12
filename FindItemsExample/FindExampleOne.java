package FindItemsExample;

import java.util.Arrays;
import java.util.List;


/**
 * Code example of finding an element in a list using an enhanced for loop
 */
public class FindExampleOne {

    public static void main(String[] args) {

        final List<String> friendsList = Arrays.asList("Isaac", "Mike", "Kevin", "Doug");


        //clean up code
        for (String name : friendsList) {
            if (name.startsWith("D")) {
                System.out.println(name);
            }
        }

    }
}
