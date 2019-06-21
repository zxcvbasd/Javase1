package Day3;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个同学的年龄:");
        int a = sc.nextInt();
        System.out.println("请输入第一个同学的年龄:");
        int b = sc.nextInt();

        int c = bj(a,b);
        System.out.println("两个同学年龄比较大的是:"+c);
    }
    public static int bj(int a,int b){
        if(a>b){
            return a;
//            System.out.println("第一个同学的年龄比较大");
        }else{
            return b;
//            System.out.println("第二个同学的年龄比较大");
        }
    }
}
