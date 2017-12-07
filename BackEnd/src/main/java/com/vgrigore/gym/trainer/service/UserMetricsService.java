package com.vgrigore.gym.trainer.service;

import com.vgrigore.gym.trainer.model.metrics.Metrics;

import java.util.List;

/**
 * Interface defines operations with
 * user metrics
 */
public interface UserMetricsService {


    /**
     * Get metrics by metricsId
     *
     * @param metricsId - passed metricsId
     * @return - metrics for the given metricsId
     */
    Metrics getMetrics(long metricsId);

    /**
     * Get all user metrics based on passed userId
     */
    List<Metrics> getAllUserMetrics(long userId);

    /**
     * Create new metrics entry for the given user
     *
     * @param userId - passed userId
     * @return - true if metrics created successfully, otherwise false
     */
    boolean createMetrics(long userId, Metrics metrics);


}
