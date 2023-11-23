package com.codergm.demo;

import com.codergm.keydatestructures.TemperatureRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;

public class StaticArrayDemo {
    public static void main(String[] args) {
        TemperatureRecord [] temperatureRecords = new TemperatureRecord[3_000_000_00];
        temperatureRecords[0] = new TemperatureRecord(23.5, "NY",LocalDateTime.now());
        temperatureRecords[2_999_999_99] = new TemperatureRecord(13.5, "Tokyo",LocalDateTime.now());
        temperatureRecords[2] = new TemperatureRecord(-3.8, "London ",LocalDateTime.now());

//        System.out.println("tr1: "+temperatureRecords[0]);
//        System.out.println("tr2: "+temperatureRecords[1]);
//        System.out.println("tr3: "+temperatureRecords[2]);
        String city = "Tokyo";

        Arrays.asList(temperatureRecords).stream()
                .filter(tempr -> Objects.nonNull(tempr) && city.equalsIgnoreCase(tempr.getCity()))
                .forEach(temprRec -> System.out.println(temprRec.getTemprature()));

    }
}
