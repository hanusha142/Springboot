package com.hanusha.test.api;

import com.hanusha.test.model.AccruedPeriodReward;
import com.hanusha.test.model.Period;
import com.hanusha.test.service.PointsCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/v1/reward")
public class RewardController {

    private final PointsCalculationService pointsCalculationService;

    @Autowired
    public RewardController(PointsCalculationService pointsCalculationService) {
        this.pointsCalculationService = pointsCalculationService;
    }

    @GetMapping
    public Set<AccruedPeriodReward> getRewards(@RequestParam("fromDate")LocalDate fromDate,
                                                @RequestParam("toDate")LocalDate toDate){
        return pointsCalculationService.getAccuredPointsFor(Set.of(Period.of(fromDate, toDate)));
    }
}
