package com.codywilmeth;

public class Main {

    public static void main(String[] args) {

        Thread t = new Thread(new ThreadExample(),"My Thread");
        t.start();

        for(int i=0; i<100;i++){
            System.out.println("Main Thread: " + i);

            try{
                Thread.sleep(100);
            }
            catch(InterruptedException ie){
                System.out.println("Child thread interrupted!" + ie);
            }

            System.out.println("Main Thread Finished!");
        }
    }
}
