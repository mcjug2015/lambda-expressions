package ReusingLambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ImprovedReuseExample {


    /**
     * Returns a Predicate that can be passed to the FILTER method
     */
    private static Predicate<String> checksIfStartsWith(final String letter){

        return name -> name.startsWith(letter);
    }

    public static void main(String[] args){

        final List<String> friendsList = Arrays.asList("Isaac", "Victor", "Johnny", "Greg");

        final List<String> managersList = Arrays.asList("Susan", "Stacey", "Mike", "Linda");

        final List<String> coworkersList = Arrays.asList("Kevin", "Joe", "Jessica");


        final long countFriendsStartV = friendsList.stream().filter(checksIfStartsWith("V")).count();

        final long countManagersStartS = managersList.stream().filter(checksIfStartsWith("S")).count();

        final long countCoworkersStartJ = coworkersList.stream().filter(checksIfStartsWith("J")).count();

        System.out.println("This many friendsList start with V = " + countFriendsStartV);
        System.out.println("This many managersList start with S = " + countManagersStartS);
        System.out.println("This many coworkersList start with J = " + countCoworkersStartJ);
    }
}
