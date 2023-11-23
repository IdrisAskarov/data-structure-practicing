package com.codergm.demo;

import com.codergm.keydatestructures.TemperatureRecord;

import java.time.LocalDateTime;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<TemperatureRecord> stack = new Stack();
        TemperatureRecord t1 = new TemperatureRecord(23.5, "NY", LocalDateTime.now());
        TemperatureRecord t2 = new TemperatureRecord(13.5, "Tokyo", LocalDateTime.now());
        TemperatureRecord t3 = new TemperatureRecord(-3.8, "London ", LocalDateTime.now());
        stack.push(t1);
        stack.push(t2);

        stack.push(t3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
