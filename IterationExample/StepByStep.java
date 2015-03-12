//package IterationExample;
//
//import java.util.Arrays;
//import java.util.List;
////import java.util.function.Consumer;
//
///**
// * Code showing each example step by step
// */
//public class StepByStep {
//
//    public static void main(String[] args){
//
//        /**
//         * Create a list of strings
//         */
//        final List<String> friendsList = Arrays.asList("Isaac", "Mike", "Kevin", "Doug");
//
//
//        /**
//         * Use a basic FOR loop to iterate through the list of strings
//         */
//        for(int i = 0; i < friendsList.size(); i++)	{
//        	System.out.println(friendsList.get(i));
//        }
//
//
//        /**
//         * Use an enhanced FOR loop to iterate through the list of strings
//         */
//        for(String friend : friendsList) {
//        	System.out.println(friend);
//        }
//
//
//        /**
//         * Use an anonymous inner class of a Consumer to iterate through the list of strings
//         */
//        friendsList.forEach(new Consumer<String>() {
//        	public void accept(final String name) {
//        		System.out.println(name);
//        	}
//        });
//
//
//        /**
//         * Use a lambda expression to iterate through the list of strings
//         */
//        friendsList.forEach((final String name) -> System.out.println(name));
//
//
//        /**
//         * Clean up the lambda expression by removing the type reference
//         */
//        friendsList.forEach((name) -> System.out.println(name));
//
//
//        /**
//         * Clean up the lambda expression more by removing the parenthesis around the parameter
//         */
//        friendsList.forEach(name -> System.out.println(name));
//
//
//        /**
//         * Clean up the lambda expression by using a method reference
//         */
//        friendsList.forEach(System.out::println);
//
//    }
//
//}
