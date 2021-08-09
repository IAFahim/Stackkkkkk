package Stackk;

public class Stack2 {
    private int stackSize;
    private char[] stackArr;
    private int top;
    private char Character_MIN_VALUE;

    public Stack2(int size){
        stackSize = size;
        stackArr = new char[stackSize];
        top=-1;
    }
    public void push(char item){

        stackArr[++top]=item;
    }
    public char peek(){

        return stackArr[top];
    }
    public char pop(){
        char item = peek();
        stackArr[top--]='\0';// or we can use '\0'/Character_MIN_VALUE
        return item;
    }
    public boolean isStackEmpty(){
        return (top==1);
    }
    public boolean isStackFull(){
        return (top==stackSize-1);
    }

}
