package com.vgrigore.gym.trainer.service;

import com.vgrigore.gym.trainer.dao.UserMetricsRepository;
import com.vgrigore.gym.trainer.model.Metrics;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementation retrieves users metrics
 * also save them and edit if needed.
 *
 */
@Service
public class UserMetricsServiceImpl implements UserMetricsService{

    private UserMetricsRepository metricsRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserMetricsServiceImpl.class);

    @Autowired
    public UserMetricsServiceImpl(UserMetricsRepository metricsRepository) {
        this.metricsRepository = metricsRepository;
    }


    @Override
    public Metrics getMetrics(long userId) {
        Metrics metrics = metricsRepository.findMetricsByUserId(userId);
        LOGGER.debug("Metrics: {0} founded for userId: {1}");
        return metrics;
    }

    @Override
    public boolean createMetrics(long userId, Metrics metrics) {
        return metricsRepository.createMetrics(userId, metrics);
    }

    public UserMetricsRepository getMetricsRepository() {
        return metricsRepository;
    }
}
