package com.henu.ChapterThreeExercise;

import java.util.Random;

public class Exercise_Random {
    public static void main(String[] args) {
        Random random=new Random();
        for (int i=0;i<10;i++){
            System.out.println(Math.abs(random.nextInt(10)));
        }
    }

}
