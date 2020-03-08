package com.rocket.common.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 反射工具类
 * @author: Panson
 **/

public class ReflectionUtils {

    /**
     * 根据 class 创建对象的类
     *
     * @param clazz 待创建对象的类
     * @param <T>   对象类型
     * @return 创建好的对象
     */
    public static <T> T newInstance(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * 获取 public 修饰的方法列表
     * @param clazz 对象的类
     * @return public 修饰的方法列表
     */
    public static Method[] getPublicMethods(Class clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        List<Method> publicMethods = new ArrayList<>();
        for (Method method : methods) {
            if (Modifier.isPublic(method.getModifiers())) {
                publicMethods.add(method);
            }
        }
        return publicMethods.toArray((new Method[0]));
    }

    /**
     * 调用指定对象的指定方法
     *
     * @param object 被调用方法的对象
     * @param method 被调用的方法
     * @param args 方法的参数
     * @return 返回的结果
     */
    public static Object invoke(Object object, Method method, Object... args) {
        try {
            return method.invoke(object, args);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }


}
