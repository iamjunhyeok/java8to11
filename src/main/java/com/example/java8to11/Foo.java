package com.example.java8to11;

import java.util.function.Function;

public class Foo {

    public static void main(String[] args) {
        Function<Integer, Integer> plus10 = integer -> integer + 10;
        Function<Integer, Integer> multiply2 = integer -> integer * 2;
        System.out.println("plus10 = " + plus10.apply(10));;
        System.out.println("multiply2 = " + multiply2.apply(45));

        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
        System.out.println("multiply2AndPlus10 = " + multiply2AndPlus10.apply(4));

        Function<Integer, Integer> plus10AndMultiply2 = plus10.andThen(multiply2);
        System.out.println("plus10AndMultiply2 = " + plus10AndMultiply2.apply(4));

    }
}
