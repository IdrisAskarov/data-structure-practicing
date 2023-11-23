package com.codergm;

import com.codergm.keydatestructures.TemperatureRecord;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<TemperatureRecord> temperatureRecordList = new LinkedList<>();
        TemperatureRecord t1 = new TemperatureRecord(23.5, "NY", LocalDateTime.now());
        TemperatureRecord t2 = new TemperatureRecord(13.5, "Tokyo", LocalDateTime.now());
        TemperatureRecord t3 = new TemperatureRecord(-3.8, "London ", LocalDateTime.now());

        temperatureRecordList.add(t1);
        temperatureRecordList.add(t2);
        temperatureRecordList.add(t3);

        System.out.println(temperatureRecordList);

        temperatureRecordList.remove(t1);
        System.out.println(temperatureRecordList);


    }
}
