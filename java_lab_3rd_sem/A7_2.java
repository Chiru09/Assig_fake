class PrintNo implements Runnable {
    Thread t;
    int n;
    PrintNo(int priority, int n) {
        t = new Thread(this, "Print Thread " + n);
        t.setPriority(priority);
        t.start();

        this.n = n;

    }

    @Override
    public void run() {

        for (int i = 1; i <= n; i++)
            System.out.println(t.getName() + " " + i);

    }
}

public class A7_2 {

    public static void main(String[] args) {
        new PrintNo(5, 50);
        new PrintNo(9, 25);
    }

}