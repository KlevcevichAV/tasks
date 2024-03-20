import java.util.function.Consumer;

class ThreadExample implements Runnable {

    int[] array;
    Consumer<Integer> consumer;

    public ThreadExample(int[] array, Consumer<Integer> consumer) {
        this.array = array;
        this.consumer = consumer;
    }

    @Override
    public void run() {
        for (int j : array) {
            consumer.accept(j);
        }
    }
}
public class Solution {

    static int[] array = new int[] {1,2,3,4,5,6,7,8};

    public static void main(String[] args) {

        print();
    }

    private static void print() {
        // define first runnable which print even and wait 1 sec after print
        ThreadExample first = new ThreadExample(array, integer -> {
            try {
                if (integer % 2 == 0) System.out.println(integer);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        // define second runnable which print odd and wait 1 sec after print
        ThreadExample second = new ThreadExample(array, integer -> {
            try {
                if (integer % 2 != 0) System.out.println(integer);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        // define threads
        Thread firstThread = new Thread(first);
        Thread secondThread = new Thread(second);

        //start threads
        firstThread.start();
        secondThread.start();

    }

}
