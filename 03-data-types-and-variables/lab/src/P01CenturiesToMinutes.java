import java.util.Scanner;

public class P01CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Centuries = ");
        byte centuries = console.nextByte();
        short years = (short) (centuries * 100);
        int days = (int) (years * 365.2422);
        long hours = 24 * days;
        long minutes = 60 * hours;
        
        System.out.println(centuries + " centuries = " + years + " years = " +
                days + " days = " + hours + " hours = " + minutes + " minutes");
        
        console.close();
    }
}