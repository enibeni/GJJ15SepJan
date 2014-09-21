package org.edu.getjavajob.lesson6;

import java.util.Stack;

/**
 * @author Alex
 * @since 21.09.14
 */
public class Sample2 {
    public static void main(String[] args) {
        //
        String s = "<h1><h2></h2></h2>1 + (1 + 2) ({}[](((()))))- (2/3)()()()()";

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);

            if(c == '(') {
                stack.push(c);
            } else if(c == ')') {
                if(stack.isEmpty() ) {
                    System.out.println("Broken");
                    break;
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()) {
            System.out.println("Broken");
        } else {
            System.out.println("Ok.");
        }
    }
}
