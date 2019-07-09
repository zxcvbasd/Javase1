package Demo2;

public class Demo1 {
    static int score1 = 86;
    static int score2 = 92;
    public static int sum(){
        int sum = score1 + score2;
        return sum;
    }
    public static void main(String[] args) {
        int allScore = sum();
        System.out.println(allScore);
    }
}
