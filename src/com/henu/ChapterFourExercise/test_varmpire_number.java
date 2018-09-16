package com.henu.ChapterFourExercise;

public class test_varmpire_number {
    public static void main(String[] args) {
        test_varmpire_number t=new test_varmpire_number();
        t.test1(4);
    }
    public void test1(int n){
        int x= (int) Math.pow(10,(n/2)-1);
        int y= (int) (Math.pow(10,(n/2)));
        int s;
        String[] a;
        String c;
        boolean e;
        for (int i=(int) Math.pow(10,(n/2)-1);i<=y-1;i++){
            if(i==21){
//                System.out.println(i);
            }
            for (int j=(int) Math.pow(10,(n/2)-1);j<=y-1;j++){
                if (j==60){
//                    System.out.println(j);
                }


                s=j*i;
                c=s+"";

                a=(i+""+j).split("");
                if (c.length()==n){
                    for (int d=0;d<a.length;d++){
                        e=c.contains(a[d]);
                        if(e){
                            c=c.replaceFirst(a[d],"");
                        }
                    }
                    if (c.length()<1){
                        System.out.println(s+"="+i+"*"+j);
                    }
                }
            }
        }

    }

}
