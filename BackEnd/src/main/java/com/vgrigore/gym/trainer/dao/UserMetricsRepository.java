package com.vgrigore.gym.trainer.dao;

import com.vgrigore.gym.trainer.model.metrics.Metrics;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User metrics repository get/edit/store
 * data in DB layer
 *
 */
@Repository
public class UserMetricsRepository {


    private Logger LOGGER = LoggerFactory.getLogger(UserMetricsRepository.class);

    /**
     * Find user metrics by metricsId
     *
     * @return - metrics for given metricsId
     */
    public Metrics findMetricsById(long metricsId) {
        LOGGER.debug("Try to find metrics by metricsId: {0}", metricsId);
        //todo: get from DB-layer
        LOGGER.debug("Founded metrics for metricsId: {0}", metricsId);
        return null;
    }


    /**
     * Find all user metrics by userId
     *
     * @return - list of metrics which relevant to the given userId
     *
     */
    public List<Metrics> findAllMetricsByUserId(long userId) {
        LOGGER.debug("Try to find all user metrics by userId:{0}", userId);
        //todo: get from DB-layer
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
        //todo: get from DB-layer
        LOGGER.debug("Metrics for userId: {0} created: {1}", userId, true);
        return true;
    }
}
