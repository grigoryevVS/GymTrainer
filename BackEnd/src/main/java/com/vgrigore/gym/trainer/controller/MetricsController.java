package com.vgrigore.gym.trainer.controller;

import com.vgrigore.gym.trainer.model.Metrics;
import com.vgrigore.gym.trainer.service.UserAccountServiceImpl;
import com.vgrigore.gym.trainer.service.UserMetricsServiceImpl;
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

    private final UserMetricsServiceImpl metricsService;

    private final UserAccountServiceImpl accountService;

    private static final Logger LOGGER = LoggerFactory.getLogger(MetricsController.class);

    @Autowired
    public MetricsController(UserMetricsServiceImpl metricsService, UserAccountServiceImpl accountService) {
        this.metricsService = metricsService;
        this.accountService = accountService;
    }

    /**
     * Get user metrics
     *
     * @param userId - userId
     * @return - user metrics
     */
    @RequestMapping(method = GET)
    public Metrics getUserMetrics(@PathVariable long userId) {
        validateUser(userId);
        Metrics metrics = metricsService.getMetrics(userId);
        LOGGER.debug("Metrics for the user: {0} is: {1}", userId, metrics);
        return metrics;
    }

    /**
     * Create new metrics entry for the user
     *
     * @param userId - userId
     * @param metrics - new metrics parameters
     * @return - violations if smth wrong or success
     */
    @RequestMapping(method = POST, value = "/create")
    public ResponseEntity<?> createNewMetrics(@PathVariable long userId, @RequestBody Metrics metrics) {
        validateUser(userId);
        boolean created = metricsService.createMetrics(userId, metrics);
        // handle the returned value and set it into responseEntity
        return ResponseEntity.noContent().build();
    }

    /**
     * Validate if user founded by passed userId
     *
     * @param userId - userId
     */
    private void validateUser(long userId) {
        // ??? orElseThrow
        accountService.findUserById(userId).orElseThrow(() -> new RuntimeException("Account not found"));
    }


    public UserMetricsServiceImpl getMetricsService() {
        return this.metricsService;
    }

    public UserAccountServiceImpl getAccountService() {
        return accountService;
    }
}
