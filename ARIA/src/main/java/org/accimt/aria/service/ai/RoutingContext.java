package org.accimt.aria.service.ai;

import java.util.ArrayList;
import java.util.List;

public class RoutingContext {
    private static final ThreadLocal<List<String>> CALLED_ENDPOINTS = ThreadLocal.withInitial(ArrayList::new);
    private static final ThreadLocal<Object> LAST_RESULT = new ThreadLocal<>();

    public static List<String> getCalledEndpoints() {
        return CALLED_ENDPOINTS.get();
    }

    public static void addEndpoint(String endpoint) {
        CALLED_ENDPOINTS.get().add(endpoint);
    }

    public static Object getLastResult() {
        return LAST_RESULT.get();
    }

    public static void setLastResult(Object result) {
        LAST_RESULT.set(result);
    }

    public static void clear() {
        CALLED_ENDPOINTS.get().clear();
        LAST_RESULT.remove();
    }
}
