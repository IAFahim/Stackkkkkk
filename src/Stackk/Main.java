package Stackk;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stack myystck= new Stack(5);
       // System.out.println("Pushing items into the stack: ");
        for (int i=0;i<5;i++){
            myystck.push(i+1);
        }
       // System.out.println("Items successfully pushed!");
        System.out.println();
      //  System.out.println("Popping items from the stack!");
         myystck.pop();
         myystck.pop();
         myystck.displayStack();
        System.out.println("\nThe size of the stack: "+myystck.getStackSize());

    }
}
