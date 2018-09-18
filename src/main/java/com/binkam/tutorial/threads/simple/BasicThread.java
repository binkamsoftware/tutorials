package com.binkam.tutorial.threads.simple;

/**
 * This class demonstrates a simple thread concept.
 */
public class BasicThread {

    /**
     * This class is an inner class which implements Runnable.
     * This method prints the string that is passed to the
     * constructor.
     */
    private static class PrintJob implements Runnable{
        private String printable;
        public PrintJob(String printable){
            this.printable = printable;
        }
        @Override
        public void run() {
            System.out.println(">>>>------Thread: "+Thread.currentThread().getId()+"----->"+this.printable);
        }
    }

    /**
     * This the main method.
     * We are defining 4 thread objects with PrintJob.
     * Even though we run the threads 1,2,3,4 order,
     * when it is run in real time, the order is not guaranteed.
     *
     *
     * Ex. Output would be as below.
     *  >>>>------Thread: 11-----> Binkam 1
     *  >>>>------Thread: 14-----> Binkam 4
     *  >>>>------Thread: 13-----> Binkam 3
     *  >>>>------Thread: 12-----> Binkam 2
     *
     * @param args
     */
    public static void main(String[] args) {
        Thread t = new Thread(new PrintJob(" Binkam 1"));
        Thread t1 = new Thread(new PrintJob(" Binkam 2"));
        Thread t2 = new Thread(new PrintJob(" Binkam 3"));
        Thread t3 = new Thread(new PrintJob(" Binkam 4"));
        t.start();
        t1.start();
        t2.start();
        t3.start();
    }
}
