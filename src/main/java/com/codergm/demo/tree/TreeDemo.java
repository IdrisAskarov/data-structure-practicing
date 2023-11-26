package com.codergm.demo.tree;

import com.codergm.keydatestructures.TemperatureRecord;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeDemo {
    public static void main(String[] args) {
        Set<TemperatureRecord> set = new TreeSet<>(Comparator.comparing(TemperatureRecord::getCity));
        TemperatureRecord t1 = new TemperatureRecord(23.5, "NY", LocalDateTime.now());
        TemperatureRecord t2 = new TemperatureRecord(13.5, "Tokyo", LocalDateTime.now());
        TemperatureRecord t3 = new TemperatureRecord(-3.8, "London ", LocalDateTime.now());
        set.add(t1);
        set.add(t2);
        set.add(t3);
        System.out.println(set);
    }
}
