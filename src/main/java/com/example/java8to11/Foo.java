package com.example.java8to11;

import java.util.function.*;

public class Foo {

    public static void main(String[] args) {
        Function<Integer, Integer> plus10 = integer -> integer + 10;
        UnaryOperator<Integer> multiply2 = integer -> integer * 2;
        System.out.println("plus10 = " + plus10.apply(10));;
        System.out.println("multiply2 = " + multiply2.apply(45));

        BiFunction<Integer, Integer, Integer> plus = (integer, integer2) -> integer + integer2;
        BinaryOperator<Integer> multiply = (integer, integer2) -> integer * integer2;
        System.out.println("plus.apply(1, 2) = " + plus.apply(1, 2));
        System.out.println("multiply.apply(3, 4) = " + multiply.apply(3, 4));

        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
        System.out.println("multiply2AndPlus10 = " + multiply2AndPlus10.apply(4));

        Function<Integer, Integer> plus10AndMultiply2 = plus10.andThen(multiply2);
        System.out.println("plus10AndMultiply2 = " + plus10AndMultiply2.apply(4));

        Consumer<Integer> print = integer -> System.out.println("integer = " + integer);
        print.accept(30);

        Supplier<Integer> get10 = () -> 10;
        System.out.println("get10.get() = " + get10.get());

        Predicate<String> startsWithJ = s -> s.startsWith("J");
        System.out.println("startsWithJ = " + startsWithJ.test("ABCD"));
        System.out.println("startsWithJ = " + startsWithJ.test("JABCD"));
    }
}
