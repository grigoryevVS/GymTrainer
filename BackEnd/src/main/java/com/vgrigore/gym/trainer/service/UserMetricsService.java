package com.vgrigore.gym.trainer.service;

import com.vgrigore.gym.trainer.dao.UserMetricsRepository;
import com.vgrigore.gym.trainer.model.Metrics;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service retrieves users metrics
 * also save them ad edit if needed.
 *
 */
@Service
public class UserMetricsService {

    private UserMetricsRepository metricsRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserMetricsService.class);

    @Autowired
    public UserMetricsService(UserMetricsRepository metricsRepository) {
        this.metricsRepository = metricsRepository;
    }

    /**
     * Get metrics by userId
     *
     * @param userId - passed userId
     * @return - metrics for the given userId
     */
    public Metrics getMetrics(long userId) {
        Metrics metrics = metricsRepository.findMetricsByUserId(userId);
        LOGGER.debug("Metrics: {0} founded for userId: {1}");
        return metrics;
    }

    /**
     * Create new metrics entry for the given user
     *
     * @param userId - passed userId
     * @return - true if metrics created successfully, otherwise false
     */
    public boolean createMetrics(long userId, Metrics metrics) {
        return metricsRepository.createMetrics(userId, metrics);
    }


    public UserMetricsRepository getMetricsRepository() {
        return metricsRepository;
    }
}
