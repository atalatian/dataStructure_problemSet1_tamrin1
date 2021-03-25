import java.util.Scanner;

public class Main {

    static int fibonacci(int n){
        if (n==1){
            return 0;
        }else if (n==2){
            return 1;
        }
        return fibonacci(n-2) + fibonacci(n-1);
    }

    public static void main(String[] args) {
        Scanner nObj = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = nObj.nextInt();
        System.out.printf("The %dth number of fibonacci is: %d", n, fibonacci(n));
    }
}
