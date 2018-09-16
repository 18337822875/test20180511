package com.henu.ChapterFourExercise;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class javaReflect {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        Class<?> c=Class.forName("com.henu.ChapterFourExercise.testStr");

        Method m=c.getMethod("testStr",int.class);

        m.invoke(c.newInstance(),8);

    }
}
