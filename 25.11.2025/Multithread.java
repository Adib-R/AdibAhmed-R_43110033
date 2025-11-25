package nov25_25;

public class Multithread {
    public static void main(String args[]) {

        // object creation for thread classes
        Numeric num = new Numeric();
        Alpha alp = new Alpha();

        // start the thread
        num.start();
        alp.start();

        // get the name of the thread
        System.out.println("Number Thread : " + num.getName());
        System.out.println("Alphabets Thread : " + alp.getName());

        // get the priority
        System.out.println("Number Thread Priority : " + num.getPriority());
        System.out.println("Alphabets Thread Priority : " + alp.getPriority());

        // check the state of the thread
        System.out.println("Number Thread State : " + num.getState());
        System.out.println("Alphabets Thread State : " + alp.getState());

        // checking the current thread
        System.out.println("Current Thread : " + Thread.currentThread().getName());

        // set the name to thread
        num.setName("Naomi");
        alp.setName("Nashley");

        // check the state of the thread again
        System.out.println("Number Thread State : " + num.getState());
        System.out.println("Alphabets Thread State : " + alp.getState());

        // checking whether it's alive or not
        if (num.isAlive()) {
            System.out.println("Naomi thread is Alive");
        } else {
            System.out.println("Naomi Thread is dead");
        }

        if (alp.isAlive()) {
            System.out.println("Nashley thread is Alive");
        } else {
            System.out.println("Nashley thread is dead");
        }
    }
}

class Numeric extends Thread {
    int a = 0;

    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                a++;
                System.out.println("Numeric Thread : " + a);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Alpha extends Thread {
    char a = 'A';

    public void run() {
        try {
            for (int i = 0; i <= 25; i++) {
                System.out.println("Alpha Thread : " + a);
                a++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}