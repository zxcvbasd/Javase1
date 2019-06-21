package Week01;

import java.util.Scanner;

public class CeShi01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int x = sc.nextInt();
        char today = (char) x;
        switch (today) {
            case 1:
            case 3:
            case 5:
                System.out.println("早餐吃包子");
                break;
            case 2:
            case 4:
            case 6:
                System.out.println("早餐吃油条");
                break;

            case 7:
                System.out.println("吃主席套餐");
                break;

            default:
                System.out.println("想吃啥吃啥");
                break;
        }
    }
}
