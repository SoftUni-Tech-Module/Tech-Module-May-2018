import java.util.Arrays;
import java.util.Scanner;

public class p06RectanglePosition {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Rectangle rectangle1 = readRectangle();
        Rectangle rectangle2 = readRectangle();

        if (rectangle1.isInsied(rectangle2)) {
            System.out.println("Inside");
        } else {
            System.out.println("Not Inside");
        }
    }

    private static Rectangle readRectangle() {
        int[] coordinates = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int left = coordinates[0];
        int top = coordinates[1];
        int width = coordinates[2];
        int height = coordinates[3];
        int right = left + width;
        int bottom = top + height;

        Rectangle rectangle = new Rectangle(left, top, width, height, right, bottom);

        return rectangle;
    }

    static class Rectangle {
        private int left;
        private int top;
        private int width;
        private int height;
        private int right;
        private int bottom;

        public Rectangle(int left, int top, int width, int height, int right, int bottom) {
            this.left = left;
            this.top = top;
            this.width = width;
            this.height = height;
            this.right = right;
            this.bottom = bottom;
        }

        public int getLeft() {
            return left;
        }

        public void setLeft(int left) {
            this.left = left;
        }

        public int getTop() {
            return top;
        }

        public void setTop(int top) {
            this.top = top;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getRight() {
            return right;
        }

        public void setRight(int right) {
            this.right = right;
        }

        public int getBottom() {
            return bottom;
        }

        public void setBottom(int bottom) {
            this.bottom = bottom;
        }

        public boolean isInsied(Rectangle rectangle) {
            return rectangle.left <= left &&
                    rectangle.getTop() <= top &&
                    rectangle.getRight() >= right &&
                    rectangle.getBottom() >= bottom;
        }
    }
}
