package Week01;

public class CeShi04 {
    public static void main(String[] args){
        int sum = 0;
        for(int i=1;i<=100;i++){
            if (i%3!=0){
              sum = sum + i;
            }
        }
        System.out.println("1到100之间不能被3整除的树枝和为:"+sum);
    }
}
