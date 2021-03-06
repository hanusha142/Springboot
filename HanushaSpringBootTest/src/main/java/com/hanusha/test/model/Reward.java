package com.hanusha.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reward {
    private Customer customer;
    private int rewardPoints;
    private Period period;
}
