import java.util.Scanner;
import static java.lang.Thread.sleep;

class Printing_A_to_Z implements Runnable {
    Thread t;

    Printing_A_to_Z() {
        t = new Thread(this, "Print A to Z");
        t.start();
    }

    public void run() {
        try {
            for (char j = 'a'; j <= 'z'; j++)
                System.out.println(j);
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

class A7_1 {
    public static void main(String[] args) {

        new Printing_A_to_Z();

    }


}