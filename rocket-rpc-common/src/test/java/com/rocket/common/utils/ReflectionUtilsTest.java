package com.rocket.common.utils;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class ReflectionUtilsTest {


    @Test
    public void newInstance() {
        TestClass testClass = ReflectionUtils.newInstance(TestClass.class);
        assertNotNull(testClass);
    }

    @Test
    public void getPublicMethods() {
        Method[] publicMethods = ReflectionUtils.getPublicMethods(TestClass.class);
        assertEquals(1, publicMethods.length);
        String methodName = publicMethods[0].getName();
        assertEquals("a", methodName);
    }

    @Test
    public void invoke() {
        Method[] publicMethods = ReflectionUtils.getPublicMethods(TestClass.class);
        Method a = publicMethods[0];
        TestClass t = new TestClass();
        Object result = ReflectionUtils.invoke(t, a);
        assertEquals("a", result);
    }
}
