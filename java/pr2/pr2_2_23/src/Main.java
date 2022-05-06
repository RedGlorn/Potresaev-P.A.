public class Main {
    public static void main(String[] args) {
        int[]a= new int[] {13,3,7,456,300,36};
        int max=0,i,s,ch=0;

        for (i=0;i<6;i++) {
            if (a[i] > max) {
                max = a[i];
                ch = i;
            }
        }
        for (i=0;i<ch;i++) {
            for (int j=0;j<ch;j++) {
                if (a[j] > a[j+1]) {
                    s = a[j];
                    a[j] = a[j+1];
                    a[j+1] = s;
                }
            }
        }
            for (i=0;i<6;i++)
                System.out.println(a[i] + " ");
    }
}

//Найти максимальный элемент и его порядковый номер в одномерном массиве.
//Затем упорядочить по возрастанию элементы, расположенные перед максимальный элементом