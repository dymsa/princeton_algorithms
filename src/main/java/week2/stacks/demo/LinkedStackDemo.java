package week2.stacks.demo;

import week2.stacks.*;
import edu.princeton.cs.algs4.*;


public class LinkedStackDemo {
    public static void main(String[] args) {
        StackOfStrings stack = new LinkedStackOfStrings();
        while(!StdIn.isEmpty()){
            String s = StdIn.readString();
            if (s.equals("-")){
                StdOut.print(stack.pop());
            }else{
                stack.push(s);
            }
        }
    }
}
