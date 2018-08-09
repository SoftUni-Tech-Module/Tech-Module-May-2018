import java.util.Scanner;

public class P09MultiplicationTable {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        byte num = Byte.parseByte(s.nextLine());

        for (byte i = 1; i <= 10; i++)
        {
            System.out.printf("%d X %d = %d\n", num, i, num * i);
        }

        s.close();
    }

    public static void mainWhileLoop(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int cnt = 1;

        while (cnt <= 10)
        {
            System.out.printf("%d X %d = %d%n", n, cnt, n * cnt);
            cnt++;
        }
    }
}
