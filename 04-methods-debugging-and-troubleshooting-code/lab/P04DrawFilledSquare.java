import java.util.Scanner;

public class P04DrawFilledSquare {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cols = Integer.parseInt(console.nextLine());

        PrintSquare(cols);

    }

    static void PrintSquare(int cols){
        PrintHeader(cols);
        PrintMiddle(cols);
        PrintHeader(cols);
    }

    static void PrintHeader(int cols){
        for (int row = 0; row <2*cols ; row++) {
            System.out.print("-");
        }

        System.out.println();
    }

    static void PrintMiddle(int n ){
        for (int row = 0; row <n-2 ; row++) {
            System.out.print("-");
            for (int col = 0; col < n-1; col++) {
                System.out.print("\\/");
            }

            System.out.println("-");
        }

    }
}
