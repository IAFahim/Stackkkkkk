package Stackk;

public class Stack {
    private int[] stack;
    private int top;

    public Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int item) {
        if (top < stack.length - 1) {
            stack[++top] = item;
        } else {
            System.out.println("Stack overflow!");
        }

    }

    public int pop() {
        if (top >= 0) {
            return stack[top--];
        } else {
            System.out.println("Stack underflow!!");
            return -111;
        }
    }

    public int getStackSize() {
        return top + 1;
    }

    // Stranger code starts form here
    public void displayStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + ", ");
        }

    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        for (int i = 0; i < 10; i++) {
            int x = (int) (Math.random() * 10);
            System.out.print(x + ", ");
            stack.push(x);
        }
        stack.displayStack();
    }

}
