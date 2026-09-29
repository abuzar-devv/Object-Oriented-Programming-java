class Rectangle {
    int length;
    int width;

    int calculateArea() {
        return length * width;
    }

    int calculatePerimeter() {
        return 2 * (length + width);
    }

    void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();

        r1.length = 10;
        r1.width = 5;

        r1.display();
    }
}
