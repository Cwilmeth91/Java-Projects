package com.codywilmeth;

public class ThreadExample implements Runnable{
    public void run(){

        for(int i=0; i<100;i++){
            System.out.println("Child Thread: " + i);

            try{
                Thread.sleep(50);
            }
            catch(InterruptedException ie){
                System.out.println("Child thread interrupted!" + ie);
            }

            System.out.println("Child Thread Finished!");


        }
    }
}
