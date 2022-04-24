package com.soulcraft.demo.errorhandling.demo6.exception;

import java.util.Collection;

/**
 * <p>
 * 异常断言
 * </p>
 *
 * @author Scott
 * @since 2022-03-10
 */
public interface Assert {
    BaseException newException(Object... args);

    default void throwNewException(Object... args) throws BaseException {
        throw newException(args);
    }

    BaseException newException(Throwable cause, Object... args);

    default void throwNewException(Throwable cause, Object... args) throws BaseException {
        throw newException(cause, args);
    }

    default void assertTrue(boolean condition, Object... args) {
        if (!condition) {
            throwNewException(args);
        }
    }

    default void assertFalse(boolean condition, Object... args) {
        if (condition) {
            throwNewException(args);
        }
    }

    default void assertNull(Object obj, Object... args) {
        assertTrue(obj == null, args);
    }

    default void assertNotNull(Object obj, Object... args) {
        assertTrue(obj != null, args);
    }

    default void assertEmpty(Collection<?> collection, Object... args) {
        assertTrue(collection != null && collection.isEmpty(), args);
    }

    default void assertNotEmpty(Collection<?> collection, Object... args) {
        assertTrue(collection != null && !collection.isEmpty(), args);
    }

    default void assertStringNotEmpty(String str, Object... args) {
        assertTrue(str != null && !str.isEmpty(), args);
    }
}
