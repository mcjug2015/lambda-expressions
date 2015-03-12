package ReusingLambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class BadReuseExampleTwo {

    public static void main(String[] args){

        final List<String> friendsList = Arrays.asList("Isaac", "Victor", "Johnny", "Greg");

        final List<String> managersList = Arrays.asList("Susan", "Doug", "Mike", "Linda");

        final List<String> coworkersList = Arrays.asList("Kevin", "Joe", "Jessica");


        /**
         * Define our lambda function
         */
        final Predicate<String> startsWithJ = name -> name.startsWith("J");

        final Predicate<String> startsWithM = name -> name.startsWith("M");


        final long countFriendsStartJ = friendsList.stream().filter(startsWithJ).count();

        //Using the new lambda
        final long countManagersStartM = managersList.stream().filter(startsWithM).count();

        final long countCoworkersStartJ = coworkersList.stream().filter(startsWithJ).count();

        System.out.println("This many friendsList start with J = " + countFriendsStartJ);
        System.out.println("This many managersList start with M = " + countManagersStartM);
        System.out.println("This many coworkersList start with J = " + countCoworkersStartJ);
    }
}

/*
 The two predicates are really just duplicates of each other.  Only the letter is changed is all.
 */
