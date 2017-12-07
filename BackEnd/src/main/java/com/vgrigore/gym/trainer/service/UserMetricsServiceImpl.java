package com.vgrigore.gym.trainer.service;

import com.vgrigore.gym.trainer.dao.UserMetricsRepository;
import com.vgrigore.gym.trainer.model.metrics.Metrics;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation retrieves users metrics
 * also save them and edit if needed.
 */
@Service
public class UserMetricsServiceImpl implements UserMetricsService {

    private UserMetricsRepository metricsRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserMetricsServiceImpl.class);

    @Autowired
    public UserMetricsServiceImpl(UserMetricsRepository metricsRepository) {
        this.metricsRepository = metricsRepository;
    }


    @Override
    public Metrics getMetrics(long metricsId) {
        Metrics metrics = metricsRepository.findMetricsById(metricsId);
        LOGGER.debug("Metrics: {0} founded for metricsId: {1}", metrics, metricsId);
        return metrics;
    }

    @Override
    public List<Metrics> getAllUserMetrics(long userId) {
        List<Metrics> userMetrics = metricsRepository.findAllMetricsByUserId(userId);
        LOGGER.debug("For userId: {0} founded {1} metrics entries.", userId, userMetrics.size());
        return userMetrics;
    }


    @Override
    public boolean createMetrics(long userId, Metrics metrics) {
        return metricsRepository.createMetrics(userId, metrics);
    }

    public UserMetricsRepository getMetricsRepository() {
        return metricsRepository;
    }
}
