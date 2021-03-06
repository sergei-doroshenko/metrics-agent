package com.fleury.metrics.agent.reporter;

import java.util.Map;

/**
 *
 * @author Will Fleury
 */
public class PrometheusMetricSystemProvider implements MetricSystemProvider {

    @Override
    public MetricSystem createMetricSystem(Map<String, String> configuration) {
        return new PrometheusMetricSystem(configuration);
    }

}
