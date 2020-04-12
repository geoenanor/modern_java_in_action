package chapter2.filters.interfaces;

import chapter2.entities.Apple;

/**
 * @author 0
 *	Quiz 2.1
 *
 *
 *Write a prettyPrintApple method that takes a List of Apples and that can be
parameterized with multiple ways to generate a String output from an apple (a bit
like multiple customized toString methods). For example, you could tell your
prettyPrintApple method to print only the weight of each apple. In addition, you
could tell your prettyPrintApple method to print each apple individually and mention
whether it’s heavy or light. The solution is similar to the filtering examples we’ve
explored so far. To help you get started, we provide a rough skeleton of the pretty-
PrintApple method:
public static void prettyPrintApple(List<Apple> inventory, ???) {
for(Apple apple: inventory) {
String output = ???.???(apple);
System.out.println(output);
}
}
 */
public interface AppleFormatter {
	String accept(Apple apple);
}
