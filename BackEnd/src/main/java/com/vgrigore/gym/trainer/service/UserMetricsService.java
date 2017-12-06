package com.vgrigore.gym.trainer.service;

import com.vgrigore.gym.trainer.model.Metrics;

/**
 * Interface defines operations with
 * user metrics
 */
public interface UserMetricsService {


    /**
     * Get metrics by userId
     *
     * @param userId - passed userId
     * @return - metrics for the given userId
     */
    Metrics getMetrics(long userId);

    /**
     * Create new metrics entry for the given user
     *
     * @param userId - passed userId
     * @return - true if metrics created successfully, otherwise false
     */
    boolean createMetrics(long userId, Metrics metrics);


}
