public class ArrayQueue implements IntQueue {
    private int[] values=new int[5];
    private int firstInQueue;
    private int lastInQueue;


    public void add(int i) {
        if (++lastInQueue == values.length) {
            lastInQueue = 0;
        }
        values[lastInQueue] = i;
    }

    public int peek() {
        if (++firstInQueue == values.length) {
            firstInQueue = 0;
            return 0;
        }
        return values[firstInQueue];
    }
}
