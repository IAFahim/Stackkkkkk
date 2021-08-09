package Stackk;

public class Stack {
    private int[] stack;
    private int top;

    public Stack(int size) {
        stack = new int [size];
        top=-1;
    }
    public void push(int item){
        if (top<stack.length-1){
        stack[++top]=item;
        }
        else {
            System.out.println("Stack overflow!");
        }

    }
    public int pop(){
        if (top>=0) {
            return stack[top--];
        }
        else {
            System.out.println("Stack underflow!!");
            return -111;
        }
    }
    public int getStackSize(){
        return top+1;
    }
    public void displayStack(){
            System.out.println(stack[top+1]);

    }

}
