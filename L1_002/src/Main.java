import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //建立一个栈，用于储存字符的数目
        Stack stack = new Stack();
        //建立一个队列，用于储存空格的数目
        Queue queue = new LinkedList();

        //定义标准输入流
        Scanner scanner = new Scanner(System.in);
        //读入一个整数
        int num = scanner.nextInt();
        //读入一个字符
        char o = scanner.next().charAt(0);

        //压入第一组数
        stack.push(1);
        num -= 1;
        //压入第一组空格
        queue.add(0);
        //定义一个辅助num
        int num2 = num;
        //构建倒置沙漏
        for (int i = 3, j = 1; (num -= 2 * i) >= 0; i += 2, j++) {
            //将i入栈
            stack.push(i);
            //将j入队
            queue.add(j);
            //保存老num
            num2 = num;
        }
        //保存num
        if (num < 0) {
            num = num2;
        }

        //用于建立正置沙漏
        Stack stack2 = new Stack();
        Stack stack2_ = new Stack();
        //输出倒置沙漏
        while (!stack.empty()) {
            int i = (int) stack.pop();
            stack2.push(i);
            int j = (int) queue.remove();
            stack2_.push(j);
            //输出空格
            for (int k = 0; k < j; k++) {
                System.out.print(" ");
            }
            //输出字符
            for (int k = 0; k < i; k++) {
                System.out.print(o);
            }
            //换行
            System.out.println();
        }
        //去掉正置沙漏的塔尖
        stack2.pop();
        stack2_.pop();
        //输出正置沙漏
        while (!stack2.empty()) {
            int i = (int) stack2.pop();
            int j = (int) stack2_.pop();
            //输出空格
            for (int k = 0; k < j; k++) {
                System.out.print(" ");
            }
            //输出字符
            for (int k = 0; k < i; k++) {
                System.out.print(o);
            }
            //换行
            System.out.println();
        }
        //输出剩余字符数
        System.out.println(num);


    }
}