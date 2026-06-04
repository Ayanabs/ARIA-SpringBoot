package org.accimt.aria.service.ai;

import java.util.ArrayList;
import java.util.List;

public class RoutingContext {
    private static final ThreadLocal<List<String>> CALLED_ENDPOINTS = ThreadLocal.withInitial(ArrayList::new);
    private static final ThreadLocal<List<Object>> CALLED_RESULTS = ThreadLocal.withInitial(ArrayList::new);

    public static List<String> getCalledEndpoints() {
        return CALLED_ENDPOINTS.get();
    }

    public static void addEndpoint(String endpoint) {
        CALLED_ENDPOINTS.get().add(endpoint);
    }

    public static List<Object> getResults() {
        return CALLED_RESULTS.get();
    }

    public static void addResult(Object result) {
        CALLED_RESULTS.get().add(result);
    }

    public static void clear() {
        CALLED_ENDPOINTS.get().clear();
        CALLED_RESULTS.get().clear();
    }
}
