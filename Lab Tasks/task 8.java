class Marks {
    int mark1;
    int mark2;
    int mark3;

    // No-argument constructor
    Marks() {
        mark1 = 0;
        mark2 = 0;
        mark3 = 0;
    }

    // Three-argument constructor
    Marks(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    // Method to calculate sum
    int calculateSum() {
        return mark1 + mark2 + mark3;
    }

    public static void main(String[] args) {
        Marks m1 = new Marks();
        Marks m2 = new Marks(80, 75, 90);

        System.out.println("Sum: " + m2.calculateSum());
    }
}
