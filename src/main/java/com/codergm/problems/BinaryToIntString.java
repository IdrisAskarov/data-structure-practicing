package com.codergm.problems;

import java.util.stream.IntStream;

public class BinaryToIntString {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,1000)
                .forEach(i -> System.out.println(intToBinary(i)+" - "+binaryToIntConverter(intToBinary(i))));
    }

    private static int binaryToIntConverter(String b){
        int result = 0;
        int n = 0;
        String[] arr = b.split("");
        for(int i = arr.length-1; i >=  0; i--){
            n = Integer.parseInt(arr[i]);
            if(n == 1){
                result += Math.pow(2,arr.length-1-i);
            }
        }
        /*
        5
        2 * 0 + 2 2
        6
        2*0 + 2*1 + 2*2
        7
        2*2 + 2*1 + 2*2
        1 - 1
        10 - 2
        11 - 3
        100 - 4
        101 - 5
        110 - 6
        * */
        return result;
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
