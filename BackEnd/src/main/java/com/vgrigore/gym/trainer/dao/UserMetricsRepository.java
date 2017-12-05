package com.vgrigore.gym.trainer.dao;

import com.vgrigore.gym.trainer.model.Metrics;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * User metrics repository get/edit/store
 * data in DB layer
 *
 */
@Repository
public class UserMetricsRepository {


    private Logger LOGGER = LoggerFactory.getLogger(UserMetricsRepository.class);

    /**
     * Find user metrics by userId
     *
     * @return - metrics for user
     */
    public Metrics findMetricsByUserId(long userId) {
        LOGGER.debug("Try to find metrics by userId: {0}", userId);
        // some transformation to be done via dozer or by hands
        LOGGER.debug("Founded metrics for userId: {0}", userId);
        return null;
    }

    /**
     * Create new metrics for given userId
     *
     * @param userId - userId
     * @return - true if created successfully, otherwise false
     */
    public boolean createMetrics(long userId, Metrics metrics) {
        LOGGER.debug("Try to create metrics for userId: {0}", userId);
        // boolean return depends on success of creation
        boolean result = false;
        LOGGER.debug("Metrics for userId: {0} created: {1}", userId, result);
        return result;
    }
}
