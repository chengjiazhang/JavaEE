public class YanghuiTriangle {
    public static void main(String[] args) {
        int triangle[][] = new int[10][];
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];//初始化第二层数组大小
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j] + triangle[i - 1][j - 1];

                }
                System.out.print(triangle[i][j] + "\t");

            }
            System.out.println();//换行

        }

    }


}
