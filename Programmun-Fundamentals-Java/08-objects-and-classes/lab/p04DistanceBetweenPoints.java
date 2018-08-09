import java.util.Arrays;
import java.util.Scanner;

public class p04DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Point point1 = readPoint(scanner);
        Point point2 = readPoint(scanner);

        double distance = calculateDistance(point1, point2);

        System.out.printf("Distance: %.3f", distance);
    }

    private static double calculateDistance(Point point1, Point point2) {
        int deltaX = point2.getX() - point1.getX();
        int deltaY = point2.getY() - point1.getY();

        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);

        return distance;
    }

    private static Point readPoint(Scanner scanner) {
        int[] pointValues = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int x = pointValues[0];
        int y = pointValues[1];

        Point point = new Point(x, y);

        return point;
    }

    static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point(int y) {
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
