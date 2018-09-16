package com.henu.ChapterFourExercise.TestSynchronize;

public class SynchronizeClass {
    String a="1";

     {
         System.out.println("非静态代码块");
    }

    static{
        System.out.println("静态代码块");
    }

    public synchronized void tese(String a){

         synchronized (this){
             System.out.println("asjdjajksh");
         }

        System.out.println("syn修饰的非静态方法"+a);
    }

    public synchronized static void testStatic(String a){
        System.out.println("syn修饰的静态方法"+a);
    }


}
