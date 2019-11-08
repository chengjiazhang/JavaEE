package ListDemo;

import java.util.List;
import java.util.Random;
import java.util.Stack;

/**
 * @author: ZCJ
 * @Date: 2019-10-30 13:48
 * @Description:Stack后进先出
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
