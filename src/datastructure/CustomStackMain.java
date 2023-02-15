package datastructure;

public class CustomStackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack=new CustomStack(5);
        stack.push(4);
        stack.push(78);
        stack.push(87);
        stack.push(9);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

class CustomStack{
    protected int[] data;
    private static final int DEFAULT_VALUE =10;
    int ptr=-1;

    public CustomStack(){
        this(DEFAULT_VALUE);
    }
    public CustomStack(int size){
        this.data=new int[size];
    }

    public boolean push(int val){

        if(isFul()){
            System.out.println("Stack is full!!");
            return false;
        }
        ptr++;
        data[ptr]=val;
        return true;
    }
    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Can not pop from empty Stack");
        }
//        int val=data[ptr];
//        ptr--;
//        return val;
        return data[ptr--];
    }
    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Can not peek from empty Stack");
        }
        return data[ptr];
    }

    private boolean isFul() {
        return ptr == data.length-1;
    }
    private boolean isEmpty() {
        return ptr == -1;
    }
}
