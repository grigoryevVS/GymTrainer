package com.vgrigore.gym.trainer.controller;

import com.vgrigore.gym.trainer.model.Metrics;
import com.vgrigore.gym.trainer.service.UserMetricsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller handles view/save/edit
 * of user's metrics ( weight, hands, etc. )
 *
 */

@RestController
public class MetricsController {

    private final UserMetricsService metricsService;

    private static final Logger LOGGER = LoggerFactory.getLogger(MetricsController.class);

    @Autowired
    public MetricsController(UserMetricsService metricsService) {
        this.metricsService = metricsService;
    }

    @RequestMapping("/metrics")
    public Metrics getPersonMetrics(@RequestParam(value = "userId") long userId) {
        Metrics metrics = metricsService.getMetrics(userId);
        LOGGER.debug("Metrics for the user: {0} is: {1}", userId, metrics);
        return metrics;
    }





    public UserMetricsService getMetricsService() {
        return this.metricsService;
    }
}
