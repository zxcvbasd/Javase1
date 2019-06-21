package Day3;

public class Demo6 {
    public static void main(String[] args){
        int a = 5;
        int b = 5;
        xg(a , b);
    }
    public static void xg(int a,int b){
        for (int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
