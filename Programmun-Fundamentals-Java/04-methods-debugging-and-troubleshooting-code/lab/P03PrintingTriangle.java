import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        int n =Integer.parseInt(console.nextLine());
        PrintTriangle(n);
    }

    static void PrintTriangle(int n){
        Top(n);
        Bottom(n);
    }

    static void Bottom(int n) {
        for (int row = n-1; row >= 1; row--) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }

            System.out.println();
        }

    }

    static void Top(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }

            System.out.println();
        }

    }
}
