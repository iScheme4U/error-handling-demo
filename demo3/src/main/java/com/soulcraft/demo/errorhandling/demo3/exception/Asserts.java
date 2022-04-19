package com.soulcraft.demo.errorhandling.demo3.exception;

/**
 * <p>
 * Assert utilities
 * </p>
 *
 * @author Scott
 * @since 20220419
 */
public final class Asserts {

    /**
     * assert obj is not null, or else throw a business exception
     *
     * @param obj     validating object
     * @param message message to be shown when validation failed
     */
    public static void assertNotNull(Object obj, String message) {
        if (obj == null) {
            throw new BusinessException(message);
        }
    }

    /**
     * assert obj is neither null nor empty, or else throw a business exception
     *
     * @param obj     validating object
     * @param message message to be shown when validation failed
     */
    public static void assertNotEmpty(String obj, String message) {
        if (obj == null || obj.isEmpty()) {
            throw new BusinessException(message);
        }
    }
}
