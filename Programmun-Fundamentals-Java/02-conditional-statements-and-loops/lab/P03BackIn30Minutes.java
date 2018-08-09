import java.util.Scanner;

public class P03BackIn30Minutes {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        byte hours, minutes;

        hours = Byte.parseByte(s.nextLine());
        minutes = Byte.parseByte(s.nextLine());
        minutes += 30;

        if (minutes >= 60)
            hours++;

        hours = (byte) (hours % 24);
        minutes = (byte) (minutes % 60);

        System.out.printf("%d:%02d\n", hours, minutes);

        s.close();
    }
}
