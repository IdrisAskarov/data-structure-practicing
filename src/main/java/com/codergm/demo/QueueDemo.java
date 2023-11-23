package com.codergm.demo;

import com.codergm.keydatestructures.TemperatureRecord;

import java.time.LocalDateTime;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Deque<TemperatureRecord> queue = new LinkedList<>();
        TemperatureRecord t1 = new TemperatureRecord(23.5, "NY", LocalDateTime.now());
        TemperatureRecord t2 = new TemperatureRecord(13.5, "Tokyo", LocalDateTime.now());
        TemperatureRecord t3 = new TemperatureRecord(-3.8, "London ", LocalDateTime.now());

        queue.offer(t1);
        queue.offer(t2);
        queue.offer(t3);
        System.out.println(queue);
        TemperatureRecord temp = queue.pop();
        System.out.println(temp);
        temp = queue.pop();
        System.out.println(temp);
        temp = queue.pop();
        System.out.println(temp);
        System.out.println(queue);
    }
}
