import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //创建一个长度为十的数组
        int[] arr = new int[10];
        //初始化为零
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        //定义标准输入流
        Scanner scanner = new Scanner(System.in);
        //读入一个字符串
        String str = scanner.nextLine();
        //遍历字符串中的每一个字符
        for (int i = 0; i < str.length(); i++) {
            //将字符转换为数字
            int num = str.charAt(i) - '0';
            //将对应的数组元素加一
            arr[num]++;
        }
        //来一个十次的循环
        for (int i = 0; i < 10; i++) {
            //如果数组元素不为零
            if (arr[i] != 0) {
                //输出数字和次数
                System.out.println(i + ":" + arr[i]);
            }
        }


    }
}