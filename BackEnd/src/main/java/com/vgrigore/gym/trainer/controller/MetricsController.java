package com.vgrigore.gym.trainer.controller;

import com.vgrigore.gym.trainer.model.Metrics;
import com.vgrigore.gym.trainer.service.UserAccountService;
import com.vgrigore.gym.trainer.service.UserMetricsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Controller handles view/save/edit
 * of user's metrics ( weight, hands, etc. )
 *
 */

@RestController
@RequestMapping("/metrics/{userId}")
public class MetricsController {

    private final UserMetricsService metricsService;

    private final UserAccountService accountService;

    private static final Logger LOGGER = LoggerFactory.getLogger(MetricsController.class);

    @Autowired
    public MetricsController(UserMetricsService metricsService, UserAccountService accountService) {
        this.metricsService = metricsService;
        this.accountService = accountService;
    }

    @RequestMapping(method = GET)
    public Metrics getPersonMetrics(@PathVariable long userId) {
        validateUser(userId);
        Metrics metrics = metricsService.getMetrics(userId);
        LOGGER.debug("Metrics for the user: {0} is: {1}", userId, metrics);
        return metrics;
    }

    private void validateUser(long userId) {
        // ??? orElseThrow
        accountService.findUserById(userId).orElseThrow(() -> new RuntimeException("Account not found"));
    }

    @RequestMapping(method = POST, value = "/create")
    public ResponseEntity<?> createNewMetrics(@PathVariable long userId, @RequestBody Metrics metrics) {
//        metricsService.createMetrics(userId);
        return ResponseEntity.noContent().build();
    }


    public UserMetricsService getMetricsService() {
        return this.metricsService;
    }

    public UserAccountService getAccountService() {
        return accountService;
    }
}
