package org.accimt.aria.service.ai;

import java.util.ArrayList;
import java.util.List;

public class RoutingContext {
    private static final ThreadLocal<List<String>> CALLED_ENDPOINTS = ThreadLocal.withInitial(ArrayList::new);

    public static List<String> getCalledEndpoints() {
        return CALLED_ENDPOINTS.get();
    }

    public static void addEndpoint(String endpoint) {
        CALLED_ENDPOINTS.get().add(endpoint);
    }

    public static void clear() {
        CALLED_ENDPOINTS.get().clear();
    }
}
