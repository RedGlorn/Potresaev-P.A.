public class Main {
    public static void main(String[] args) {
        int n=5;
        int[] vec = new int[n*2];
        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            int min=100,N_min=0;
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = (int) (Math.random()*100 + 1);
                if (mat[i][j]<min){
                    min = mat[i][j];
                    N_min = j;
                }
                System.out.print(mat[i][j] + " ");
            }
            vec[2*i] = min;
            vec[2*i+1] = (N_min+1);
            System.out.println();
        }

        System.out.println("Вектор ");
        for (int j : vec) System.out.print(j + " ");

        System.out.println();
        System.out.println("Новая матрица");

        for (int i=0;i<mat.length;i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] -= vec[2 * i + 1];
                System.out.print((mat[i][j]) + " ");
            }
            System.out.println();
        }
     }
}

//Определить матрицу и заполнить её случайными элементами.
//Построить вектор B, который возвращает минимальный элемент и его номер в каждой строке матрицы.
//Затем из каждого элемента каждой строки вычесть номер минимального элемента строки.