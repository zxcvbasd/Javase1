package Day3;

public class Demo3 {
    public static void main(String[] args){
        int a = 1;
        System.out.println(a++ + ++a + (a-- - --a));
        System.out.println(a++ + ++a + (--a - a--));
    }
}
