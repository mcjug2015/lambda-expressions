package ReusingLambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class BadReuseExampleOne {

    public static void main(String[] args){

        final List<String> friendsList = Arrays.asList("Isaac", "Victor", "Johnny", "Greg");

        final List<String> managersList = Arrays.asList("Susan", "Doug", "Mike", "Linda");

        final List<String> coworkersList = Arrays.asList("Kevin", "Joe", "Jessica");


        /**
         * Define our lambda function
         */
        final Predicate<String> startsWithJ = name -> name.startsWith("J");


        final long countFriendsStartJ = friendsList.stream().filter(startsWithJ).count();

        final long countManagersStartJ = managersList.stream().filter(startsWithJ).count();

        final long countCoworkersStartJ = coworkersList.stream().filter(startsWithJ).count();

        System.out.println("This many friendsList start with J = " + countFriendsStartJ);
        System.out.println("This many managersList start with J = " + countManagersStartJ);
        System.out.println("This many coworkersList start with J = " + countCoworkersStartJ);
    }
}

/*
  Rather than duplicate the lambda expression several times, we created it once and stored
  it in a reference of type Predicate.
 */
