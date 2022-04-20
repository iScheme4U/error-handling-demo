package com.soulcraft.demo.errorhandling.demo4.exception;

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
    /**
     * 创建异常
     *
     * @return BaseException 基础异常
     */
    BusinessException newException();

    /**
     * 抛出异常
     */
    default void throwNewException() throws BusinessException {
        throw newException();
    }

    /**
     * 创建异常
     *
     * @param cause 原因
     * @return BaseException 基础异常
     */
    BusinessException newException(Throwable cause);

    /**
     * 抛出异常
     *
     * @param cause 原因
     */
    default void throwNewException(Throwable cause) throws BusinessException {
        throw newException(cause);
    }

    /**
     * 断言条件为真，否则抛出异常
     *
     * @param condition 检查条件
     */
    default void assertTrue(boolean condition) {
        if (!condition) {
            throwNewException();
        }
    }

    /**
     * 断言条件为假，否则抛出异常
     *
     * @param condition 检查条件
     */
    default void assertFalse(boolean condition) {
        if (condition) {
            throwNewException();
        }
    }

    /**
     * 断言对象为空，否则抛出异常
     *
     * @param obj 检查的对象
     */
    default void assertNull(Object obj) {
        assertTrue(obj == null);
    }

    /**
     * 断言对象非空，否则抛出异常
     *
     * @param obj 检查的对象
     */
    default void assertNotNull(Object obj) {
        assertTrue(obj != null);
    }

    /**
     * 断言集合为空，否则抛出异常
     *
     * @param collection 检查集合
     */
    default void assertEmpty(Collection<?> collection) {
        assertTrue(collection != null && collection.isEmpty());
    }

    /**
     * 断言集合非空，否则抛出异常
     *
     * @param collection 检查集合
     */
    default void assertNotEmpty(Collection<?> collection) {
        assertTrue(collection != null && !collection.isEmpty());
    }

    /**
     * 断言集合非空，否则抛出异常
     *
     * @param str 检查元素
     */
    default void assertStringNotEmpty(String str) {
        assertTrue(str != null && !str.isEmpty());
    }
}
