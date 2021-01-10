package week2.stacks.demo;

import edu.princeton.cs.algs4.*;
import week2.stacks.*;

public class FixedStackDemo {
    public static void main(String[] args) {
        FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(10);
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
