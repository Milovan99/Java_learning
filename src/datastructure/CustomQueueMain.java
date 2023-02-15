package datastructure;

public class CustomQueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue=new CustomQueue(5);
        queue.insert(5);
        queue.insert(1);
        queue.insert(6);
        queue.insert(9);

        queue.display();
        System.out.println(queue.delete());
        queue.display();

    }
}
class CustomQueue{
    private int[] data;
    protected static final int DEFAULT_SIZE=10;

    private int end=0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data=new int[size];
    }

    public boolean isFull(){
        return end==data.length;
    }

    public boolean isEmpty(){
        return end== 0;
    }

    public boolean insert(int val){
        if (isFull()){
            return false;
        }

        data[end++]=val;
        return true;
    }

    public int delete() throws Exception {
        int val = data[0];

        if(isEmpty()){
            throw new Exception("Queue is empty!");
        }
        for (int i = 1; i < end ; i++) {
            data[i-1]=data[i];
        }
        end--;
        return val;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!");
        }
        return data[0];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("END");
    }

}