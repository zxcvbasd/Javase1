package Day2;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据:");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据:");
        int b = sc.nextInt();
        int result = getMax(a, b);
        System.out.println("较大值是: " + result);
    }

    public static int getMax(int a, int b) {
        return ((a > b) ? a : b);
    }
}
