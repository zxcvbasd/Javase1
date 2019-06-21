package Day3;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个你喜欢的数字:");
        int a = sc.nextInt();
        System.out.println("请再输入一个你喜欢的数字:");
        int b = sc.nextInt();

        int qq = yf(a,b);
        System.out.println("你们的缘分是:" + qq + "%");
    }

    public static int yf(int a, int b) {
        int num = a + b;
        if(num<90){
            num += 10;
        }
        return num;
//        if(num <= 80){
//            num += 10;
//        }
//        if(num <=20 ){
//            System.out.println("洗洗睡吧!");
//            return;
//        }
//        System.out.println("你们的缘分是:" + num + "%");
    }
}
