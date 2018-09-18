package com.binkam.tutorial.threads;

public class BasicThread {

    private static class PrintJob implements Runnable{
        private String printable;
        public PrintJob(String printable){
            this.printable = printable;
        }
        @Override
        public void run() {
            //System.out.println("------Printing the printable-----");
            System.out.println(">>>>------Thread: "+Thread.currentThread().getId()+"----->"+this.printable);
            //System.out.println("-----------");
            //System.out.println("----------------------------------");
        }
    }

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
