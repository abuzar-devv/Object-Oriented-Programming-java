class Circle {
    int radius;

    Circle() {
        radius = 5;
    }

    Circle(int r) {
        radius = r;
    }

    int calculateCircumference() {
        return (int)(2 * 3.14 * radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(7);

        System.out.println("Circumference: " + c1.calculateCircumference());
        System.out.println("Circumference: " + c2.calculateCircumference());
    }
}
