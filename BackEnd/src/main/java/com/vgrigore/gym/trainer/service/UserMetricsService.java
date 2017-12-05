package com.vgrigore.gym.trainer.service;

import com.vgrigore.gym.trainer.model.Metrics;
import org.springframework.stereotype.Service;

/**
 * Service retrieves users metrics
 * also save them ad edit if needed.
 *
 */
@Service
public class UserMetricsService {


    /**
     * Get metrics by userId
     *
     * @param userId - passed userId
     * @return - metrics for the given userId
     */
    public Metrics getMetrics(long userId) {
        return null;
    }
}
