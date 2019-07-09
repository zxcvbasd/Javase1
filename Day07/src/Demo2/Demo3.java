package Demo2;

public class Demo3 {
    public static void main(String[] args) {
        Demo3 hello = new Demo3();
        int p = hello.calcAvg(94,81);
        System.out.println(p);
    }

    public int calcAvg(int a,int b){
        int p = (a+b)/2;
        return p;
    }
}
