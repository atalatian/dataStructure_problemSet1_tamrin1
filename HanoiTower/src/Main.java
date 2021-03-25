import java.util.Scanner;

public class Main {
    static void hanoi(int n, char a, char b, char c){
        if (n==1){
            System.out.printf("Move %dth disk from %c to %c\n", n, a, c);
        }else {
            hanoi(n-1, a, c, b);
            System.out.printf("Move %dth disk from %c to %c\n", n, a, c);
            hanoi(n-1, b, a, c);
        }
    }

    public static void main(String[] args) {
        Scanner nObj = new Scanner(System.in);
        System.out.println("Enter number of disks:");
        int n = nObj.nextInt();
        hanoi(n, 'a', 'b', 'c');
        System.out.printf("Number of moves: %d", (int) (Math.pow(2, n) - 1));
    }
}
