import java.util.Arrays;
import java.util.Scanner;

public class p05ClosestTwoPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        Point[] points = new Point[count];

        for (int i = 0; i < points.length; i++) {
            points[i] = readPoint(scanner);
        }

        Point[] closestTwoPoints = findClosesTwoPoints(points);
        double distance = calculateDistance(closestTwoPoints[0], closestTwoPoints[1]);
        System.out.printf("%.3f%n", distance);

        for (Point point : closestTwoPoints) {
            System.out.printf("(%d, %d)%n", point.getX(), point.getY());
        }
    }

    private static Point[] findClosesTwoPoints(Point[] points) {
        double minDistance = Double.MAX_VALUE;
        Point[] closestTwoPoints = new Point[2];

        for (int p1 = 0; p1 < points.length; p1++) {
            for (int p2 = p1 + 1; p2 < points.length; p2++) {
                double distance = calculateDistance(points[p1], points[p2]);

                if (distance < minDistance) {
                    minDistance = distance;

                    closestTwoPoints[0] = points[p1];
                    closestTwoPoints[1] = points[p2];
                }
            }
        }

        return closestTwoPoints;
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
