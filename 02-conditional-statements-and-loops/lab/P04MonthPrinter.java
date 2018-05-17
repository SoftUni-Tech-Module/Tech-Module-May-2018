import java.util.Scanner;

public class P04MonthPrinter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int monthNumber = Integer.parseInt(scan.nextLine());
        if (1 <= monthNumber && monthNumber <= 12) {
            String[] month = new String[]{
                    "January", "February", "March", "April",
                    "May", "June", "July", "August",
                    "September", "October", "November", "December"
            };
            System.out.println(month[monthNumber-1]);
            return;
        }
        System.out.println("Error!");
    }

    //using switch case
    public static void mainSwitch(String[] args) {

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch(month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }
}
