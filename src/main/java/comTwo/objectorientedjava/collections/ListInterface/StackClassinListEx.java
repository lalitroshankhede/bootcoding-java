package comTwo.objectorientedjava.collections.ListInterface;

import java.util.Stack;

public class StackClassinListEx {

    public static void main(String[] args) {

        Stack<Integer> stack= new Stack<Integer>();
        System.out.println(stack.empty());  //returns true because stack is empty.

       // System.out.println(stack.pop());  // give EmptyStackException errror becoz trying to remove element from empty stack.
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.pop());  // pop last inserted element from stack i.e 40

        System.out.println(stack.peek()); // it returns last element from the stack i.e 30 Note : But it can not remove from stack

        System.out.println(stack.empty());  //return false because stack is not empty.

        //Searching element into stack

        System.out.println(stack.search(30)); // it returns 1 because search() method in stack check the value from top of the stack

        //Size of Stack

        System.out.println(stack.size()); //3


        System.out.println( stack);



    }
}
