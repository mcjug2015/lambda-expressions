package TransformExample;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransformExampleOne {

    public static void main(String[] args) {

        final List<String> friendsList = Arrays.asList("Isaac", "Mike", "Kevin", "Doug");

        final List<String> uppercaseFriends = new ArrayList<>();

        friendsList.forEach(name -> uppercaseFriends.add(name.toUpperCase()));

        System.out.print(uppercaseFriends);
    }

}

/*
Couple of things about this example....
    Even though we are using a lambda expression
     1. We still had to create the empty list
     2. and the effort to add elements to it
 */
