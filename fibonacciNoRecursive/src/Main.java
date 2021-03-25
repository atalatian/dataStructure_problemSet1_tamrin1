import java.util.Scanner;

public class Main {
    private static int sum = 1;
    private static int previous = 0;

    static void fibonacci(int n){
        for (int i=0; i<n; i++){
            if (i==0){
                System.out.println(previous);
            }else if (i==1){
                System.out.println(sum);
            }else {
                int temp = sum;
                sum = previous + sum;
                previous = temp;
                System.out.println(sum);
            }
        }
    }

    public static void main(String[] args) {
        Scanner nObj = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = nObj.nextInt();
        fibonacci(n);
    }
}
