package com.hanusha.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Period {
    private LocalDate from;
    private LocalDate to;

    public static final Period of(LocalDate from, LocalDate to) {
        return new Period(from, to);
    }
}
