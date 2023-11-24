package com.codergm.problems;

import java.util.stream.IntStream;

public class IntToBinaryString {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,50).forEach(i -> System.out.println(i +" - "+intToBinary(i)));

    }

    private static String intToBinary(int n){
        StringBuilder result = new StringBuilder();
        while (n != 0){
            result.append(n % 2);
            n = n/2;
        }
        return result.reverse().toString();
    }
}
