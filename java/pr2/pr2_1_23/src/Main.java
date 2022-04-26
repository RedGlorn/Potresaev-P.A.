public class Main {
    public static void main(String[] args){
        int[]a= new int[] {13,3,36,5,456};
        int sum=0,i;

        for (i=0;i<5;i++){
            if (a[i]==5)
                break;
            else
                sum = sum + a[i];
        }

        System.out.println("Цифра 5 нахоится на "+ (i+1) +" месте");
        System.out.println("Сумма цифр перед 5 = "+ sum);
    }
}
