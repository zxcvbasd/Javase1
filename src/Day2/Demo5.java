package Day2;

public class Demo5 {
    public static void main(String[] args) {
        int[] y = new int[3];

        System.out.println( y );

        System.out.println(y[0]);
        System.out.println(y[1]);
        System.out.println(y[2]);
        System.out.println("----");
        y[0] = 10;
        y[2] = 20;
        System.out.println( y );

        System.out.println(y[0]);
        System.out.println(y[1]);
        System.out.println(y[2]);
    }
}
