package Day3;

public class Demo1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        String mark = (a>b)?"大于":"小于";
        System.out.println(mark);

        int c = (a++ > b--)?--a:++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
