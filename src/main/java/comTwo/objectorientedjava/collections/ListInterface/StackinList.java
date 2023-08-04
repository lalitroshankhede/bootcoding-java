package comTwo.objectorientedjava.collections.ListInterface;

import java.util.LinkedList;
import java.util.Stack;

public class StackinList {

    public static void main(String[] args) {

        Stack<String> list=new Stack<String>();
        System.out.println(list);
        list.push("Computer");
        list.push("Laptop");
        list.push("Mouse");
        list.add(null);
        list.push("Keyborad");
        list.push("CPU");
        list.push("Laptop");
        list.push("Headphone");
        list.pop();  // to pop last element of stack which is push in last but pop at first i.e Last in First Out DS

        System.out.println(list);
    }
}
