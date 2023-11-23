package com.codergm.keydatestructures;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TemperatureRecord {
    private Double temprature;
    private String city;
    private LocalDateTime regestrationDate;
}