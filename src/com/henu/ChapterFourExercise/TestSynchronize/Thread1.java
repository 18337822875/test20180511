package com.henu.ChapterFourExercise.TestSynchronize;

public class Thread1 {
    public static void main(String[] args) {

        long a=System.currentTimeMillis();

        for (int i=0;i<=10000;i++){
            SynchronizeClass.testStatic("线程1");
        }

        long b=System.currentTimeMillis();
        System.out.println("线程1的耗时******************"+(b-a));
    }
}
