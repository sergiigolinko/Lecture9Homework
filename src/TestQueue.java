public class TestQueue {
    public static void main(String args[]){
IntQueue queueArray=new ArrayQueue();
queueArray.add(6);
queueArray.add(2);
queueArray.add(3);
queueArray.add(3);
queueArray.add(3);
queueArray.add(3);
queueArray.add(3);
System.out.println(queueArray.peek());
IntQueue queueLink=new LinkedQueue();
queueLink.add(5);
queueLink.add(1);
queueArray.add(4);
System.out.println(queueLink.peek());
    }
}
