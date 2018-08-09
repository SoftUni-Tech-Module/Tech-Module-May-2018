import java.util.Scanner;

public class Elevator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Double people = s.nextDouble();
        Double capacity = s.nextDouble();
        Double courses = Math.ceil(people / capacity);
        
        System.out.printf(String.valueOf(courses.intValue()));
    }
}
