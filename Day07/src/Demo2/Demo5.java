package Demo2;

public class Demo5 {
    public static void main(String[] args) {
//        String[][] names = new String[1][2];
        String[][] names = {{"tom","jack","mike"},{"zhangsan","lisi","wangwu"}};
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j]+" ");
            }
            System.out.println();
        }
    }
}
