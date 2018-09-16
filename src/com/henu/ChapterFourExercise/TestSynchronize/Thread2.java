package com.henu.ChapterFourExercise.TestSynchronize;

public class Thread2 {
    public static void main(String[] args) {

        long a=System.currentTimeMillis();

        for (int i=0;i<=10000;i++){
            SynchronizeClass.testStatic("线程2");
        }

        long b=System.currentTimeMillis();
        System.out.println("线程2的耗时******************"+(b-a));
    }
}
