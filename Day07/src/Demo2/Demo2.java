package Demo2;

public class Demo2 {
    public static void main(String[] args) {
        Demo2 hello = new Demo2();
        hello.print();
        String a = "name";
        hello.print(a);
        int b = 1;
        hello.print(b);
    }
    public void print() {
        System.out.println("wucan");
    }
    public void print(String name) {
        System.out.println("daiyouzifuchuan" + name);
    }
    public void print(int age) {
        System.out.println("daiyouzheng" + age);
    }
}