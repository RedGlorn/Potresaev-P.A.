public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[][] mat = new int[n][n];
        int z=0,pr=1;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = (int) (Math.random() * 100 - 50);
                System.out.print(mat[i][j]+" ");
                if (i+j>n-1 && mat[i][j]<0){
                    pr*=mat[i][j];
                    z++;
                }
            }
            System.out.println();
        }
        System.out.println("Среднее геометрическое = "+ Math.pow(pr,1.0/z));
    }
}
