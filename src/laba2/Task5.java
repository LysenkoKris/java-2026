package laba2;

public class Task5 {
    // Класс Rectangle
    static class Rectangle {
        private double length;
        private double width;

        // Конструктор
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        // Геттеры
        public double getLength() {
            return length;
        }

        public double getWidth() {
            return width;
        }

        // Сеттеры
        public void setLength(double length) {
            this.length = length;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        // Площадь
        public double getArea() {
            return length * width;
        }

        // Периметр
        public double getPerimeter() {
            return 2 * (length + width);
        }

        @Override
        public String toString() {
            return "Rectangle{length=" + length + ", width=" + width +
                    ", area=" + getArea() + ", perimeter=" + getPerimeter() + "}";
        }
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 3.0);
        System.out.println(rect);

        rect.setLength(10.0);
        System.out.println(rect);
    }
}