package Day2;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Demo9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        String sex = input.next();
        if (score > 80) {
            switch (sex) {
                case "男":
                    System.out.println("男子组决赛");
                    break;
                case "女":
                    System.out.println("女子组决赛");
                    break;
            }
        }
    }
}
//        int score = 94;
//        String sex = "女";
//        String man = "男";
//
////        boolean man = (boolean)男;
//        if(score<80){
//            System.out.println("未进入决赛");
//        }else if(score>80){
//            System.out.println("进入决赛");
//        }else if( "boolean" =女){
//            System.out.println("进入女子决赛");
//        }else if("boolean" =男){
//            System.out.println("进入男子决赛");
//        }
//    }
