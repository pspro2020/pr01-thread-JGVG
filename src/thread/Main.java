package thread;

import java.lang.Thread;

public class Main {
    public static void main(String[] args) {

        for( int i = 0; i <= 10; i++){
            new MyThread(i).start();
        }
    }

    private static class MyThread extends Thread {

        private final int i;
        public MyThread(int i){ this.i = i;}

        @Override
        public void run(){
            for(int j = 0; j<=10; j++){
                System.out.println(i+"^"+j+" = "+ (int)Math.pow(i,j));
            }
        }
    }
}
