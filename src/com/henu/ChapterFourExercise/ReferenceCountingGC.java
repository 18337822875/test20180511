package com.henu.ChapterFourExercise;

public class ReferenceCountingGC {
    private  Object instance=null;
    private static final int _1MB=1024*1024;

    private byte[] bigsize=new byte[2*_1MB];

    public static void main(String[] args) {
        ReferenceCountingGC r=new ReferenceCountingGC();

    }

}
